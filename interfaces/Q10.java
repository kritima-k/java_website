package interfaces;

// Encryptable says any class implementing it must support encrypt and decrypt
interface Encryptable {
String encrypt(String data);
String decrypt(String encryptedData);
}

// AES implements Encryptable with a simple simulated encryption (shifting letters)
class AES implements Encryptable {
public String encrypt(String data) {
// this is a simplified simulation, not real AES encryption
StringBuilder result = new StringBuilder();
for (char c : data.toCharArray()) {
result.append((char) (c + 1)); // shifting each character forward by 1
}
return result.toString();
}

public String decrypt(String encryptedData) {
StringBuilder result = new StringBuilder();
for (char c : encryptedData.toCharArray()) {
result.append((char) (c - 1)); // shifting each character back by 1
}
return result.toString();
}
}

// RSA implements Encryptable with a different simulated encryption (reversing text)
class RSA implements Encryptable {
public String encrypt(String data) {

return new StringBuilder(data).reverse().toString();
}

public String decrypt(String encryptedData) {
return new StringBuilder(encryptedData).reverse().toString();
}
}

 class EncryptableInterface {
public static void main(String[] args) {
Encryptable aes = new AES();
String encryptedAES = aes.encrypt("hello");
System.out.println("AES encrypted: " + encryptedAES);
System.out.println("AES decrypted: " + aes.decrypt(encryptedAES));

Encryptable rsa = new RSA();
String encryptedRSA = rsa.encrypt("hello");
System.out.println("RSA encrypted: " + encryptedRSA);
System.out.println("RSA decrypted: " + rsa.decrypt(encryptedRSA));
}
}