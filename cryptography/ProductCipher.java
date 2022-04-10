package cryptography;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProductCipher {

  private static BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));  
  
  public static void main(String[] args) {
    try {
      menu();
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void menu() throws Exception {
    boolean running = true;
    while (running) {
      System.out.println();
      System.out.print("Menu\n");
      System.out.print("1. Encript through product cipher\n");
      System.out.print("2. Decript through product cipher\n");
      System.out.print("3. Exit\n");
      System.out.print("enter the option\n");
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
          System.out.print("invalid output\n");
          break;   
      }
    }
  }

  private static void encryptProduct() throws Exception {
    System.out.print("Enter plain text:");
    StringBuffer plainText = new StringBuffer(br.readLine().trim());
    System.out.print("Enter key:");
    int key = Integer.parseInt(br.readLine());
    StringBuffer substitutionCipher = encryptSubstitution(plainText, key);
    System.out.print("ecripted substitution cipher is "+ substitutionCipher + "\n");
    StringBuffer transposeCipher = encryptTranspose(substitutionCipher,key);
    System.out.print("encripted cipher " + transposeCipher + "\n");
  }

  private static StringBuffer encryptSubstitution(StringBuffer plainText, int key) {
    StringBuffer cipherText = new StringBuffer();
    for (int i = 0; i < plainText.length(); i++) {
      char charAtIdx = plainText.charAt(i);
      charAtIdx += key; 
      cipherText.append(charAtIdx);
    }
    return cipherText;
  }

  private static StringBuffer encryptTranspose(StringBuffer plainText, int key) {
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

  private static void decryptProduct() throws Exception {
    System.out.print("Enter cipher text\n");
    StringBuffer cipherText = new StringBuffer(br.readLine());
    System.out.print("Enter key\n");
    int key = Integer.parseInt(br.readLine());
    StringBuffer transposeCipherDecrypt = decryptTranspose(cipherText,key);
    System.out.print("decrypted transpose cipher " + transposeCipherDecrypt + "\n");
    StringBuffer plainText = decryptSubstitution(transposeCipherDecrypt, key);
    System.out.print("decrypted cipher " + plainText + "\n");
  }

  private static StringBuffer decryptSubstitution(StringBuffer cipherText, int key) {
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

  private static StringBuffer decryptTranspose(StringBuffer cipherText, int key) {
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
}