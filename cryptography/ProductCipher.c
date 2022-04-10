#include<stdio.h>


int main(){
  try {
      menu();
  } catch (e) {
    e.printStackTrace();
  }
  return 0;
}
 void menu() {
    bool running = true;
    while (running) {
      printf("Menu\n");
      printf("1. Encript through product cipher\n");
      printf("2. Decript through product cipher\n");
      printf("3. Exit\n");
      printf("enter the option\n");
      int option = Integer.parseInt(br.readLine());
      switch (option) {
        case 1:
          encryptProduct();
          break;
        case 2:
          decryptProduct();
          break;
        case 3:
          running = false;
          break;
        default:
          printf("invalid output\n");
          break;   
      }
    }
  }

 void encryptProduct() {
    printf("Enter plain text:");
    StringBuffer plainText = new StringBuffer(br.readLine().trim());
    printf("Enter key:");
    int key = Integer.parseInt(br.readLine());
    StringBuffer substitutionCipher = encryptSubstitution(plainText, key);
    printf("ecripted substitution cipher is "+ substitutionCipher + "\n");
    StringBuffer transposeCipher = encryptTranspose(substitutionCipher,key);
    printf("encripted cipher " + transposeCipher + "\n");
  }

  private StringBuffer encryptSubstitution(StringBuffer plainText, int key) {
    StringBuffer cipherText = new StringBuffer();
    for (int i = 0; i < plainText.length(); i++) {
      char charAtIdx = plainText.charAt(i);
      charAtIdx += key; 
      cipherText.append(charAtIdx);
    }
    return cipherText;
  }

  private StringBuffer encryptTranspose(StringBuffer plainText, int key) {
    StringBuffer cipherText = new StringBuffer();
    int mod;
    if ((mod = plainText.length() % key) != 0 ) {
      mod = key - mod;
      for ( ; mod != 0 ; mod--) {
        plainText.append("/");
      }
    }

    for (int i = 0; i < key; i++) {
      for (int j = 0; j < plainText.length() / key ; j++) {
        char charAtIdx = plainText.charAt(i + (j * key));
        cipherText.append(charAtIdx);
      }
    }
    return cipherText;
  }

  private void decryptProduct() {
    printf("Enter cipher text\n");
    StringBuffer cipherText = new StringBuffer(br.readLine());
    printf("Enter key\n");
    int key = Integer.parseInt(br.readLine());
    StringBuffer transposeCipherDecrypt = decryptTranspose(cipherText,key);
    printf("decrypted transpose cipher " + transposeCipherDecrypt + "\n");
    StringBuffer plainText = decryptSubstitution(transposeCipherDecrypt, key);
    printf("decrypted cipher " + plainText + "\n");
  }

  private StringBuffer decryptSubstitution(StringBuffer cipherText, int key) {
    StringBuffer plainText = new StringBuffer();
    for (int i = 0; i < cipherText.length(); i++) {
      char charAtIdx = cipherText.charAt(i);
      if (charAtIdx != '/') {
        charAtIdx -= key;
        plainText.append(charAtIdx);
      }
    }
    return plainText;
  }

  private StringBuffer decryptTranspose(StringBuffer cipherText, int key) {
    StringBuffer plainText = new StringBuffer();
    int n = cipherText.length() / key;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < cipherText.length()/n; j++) {
        char charAtIdx = cipherText.charAt(i + ( j * n));
        plainText.append(charAtIdx);
      }
    }
    return plainText;
  }