package cryptography;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProductCipher {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the message to be encrypted:");
      StringBuffer plainText = new StringBuffer(br.readLine());
      System.out.println("Enter the key:");
      int key = Integer.parseInt(br.readLine());

      StringBuffer cipherText = encryptText(plainText, key);
      System.out.println();
      System.out.println("The encrypted message is \"" + cipherText + "\"");
      System.out.println();

      System.out.println("the message to be decrypted is " + cipherText);
      StringBuffer decryptedText = decryptText(cipherText, key);
      System.out.println();
      System.out.println("The decrypted message is  \"" + decryptedText + "\"");
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static StringBuffer encryptText(StringBuffer plainText, int key) {
    StringBuffer cipherText = new StringBuffer();
    int i = 0;
    while (i < plainText.length()) {
      int plainTextChar = plainText.charAt(i);
      int cipherTextChar = plainTextChar ^ key;
      cipherText.append((char) cipherTextChar);
      System.out.println("Encrypted character " + (i + 1) + " is " + cipherText);
      i++;
    }
    cipherText = encriptRail(cipherText, key);
    System.out.println("encripted rail fence cipger is " + cipherText);
    return cipherText;
  }

  private static StringBuffer encriptRail(StringBuffer cipherText, int key) {
    char rail[][] = new char[key][(cipherText.length())];

    for (int i = 0; i < key; i++)
     for (int j = 0;j < cipherText.length();j++)
       rail[i][j] = '\n';

    boolean dir_down = false;
    int row = 0, col = 0;

    for (int i = 0; i < cipherText.length(); i++) {
      if (row == 0 || row == key - 1) dir_down = !dir_down;
      rail[row][col++] = cipherText.charAt(i);
      if (dir_down) row++; else row--;
    }

    StringBuffer result = new StringBuffer();
    for (int i = 0; i < key; i++) 
    for (int j = 0; j < cipherText.length(); j++ ) 
    if (rail[i][j] != '\n')
     result.append(rail[i][j]);

    return result;
  }

  private static StringBuffer decryptText(StringBuffer cipherText, int key) {
    StringBuffer plainText = new StringBuffer();
    int i = 0;
    cipherText = decriptRail(cipherText, key);
    System.out.println();
    System.out.println("decripted rail fense cipger is " + cipherText);
    while (i < cipherText.length()) {
      int cipherTextChar = cipherText.charAt(i);
      int plainTextChar = cipherTextChar ^ key;
      plainText.append((char) plainTextChar);
      System.out.println("Decrypted character " + (i + 1) + " is " + plainText);
      i++;
    }
    return plainText;
  }

  private static StringBuffer decriptRail(StringBuffer cipherText, int key) {
    char rail[][] = new char[key][(cipherText.length())];

    for (int i = 0; i < key; i++) 
    for (int j = 0;j < cipherText.length();j++)
    rail[i][j] = '\n';

    boolean dir_down = false;
    int row = 0, col = 0;

    for (int i = 0; i < cipherText.length(); i++) {
      if (row == 0 || row == key - 1) dir_down = !dir_down;
      rail[row][col++] = cipherText.charAt(i);
      if (dir_down) row++; else row--;
    }

    int index = 0;
    for (int i = 0; i < key; i++) 
    for (int j = 0; j < cipherText.length();j++) 
    if (rail[i][j] == '*' && index < cipherText.length()) 
    rail[i][j] =  cipherText.charAt(index++);

    StringBuffer result = new StringBuffer();
    row = 0;
    col = 0;
    for (int i = 0; i < cipherText.length(); i++) {
      if (row == 0)
            dir_down = true;
        if (row == key-1)
            dir_down = false;
        if (rail[row][col] != '*')
            result.append(rail[row][col++]);
      if (dir_down) row++; else if(row != 0)row--;
    }
    return result;
  }
}