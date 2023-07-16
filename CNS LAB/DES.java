import java.security.*;
import javax.crypto.*;
import java.util.*;
public class DES
{
public static void main(String[] argv)
{
try
{
 KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
 SecretKey myKey = keygenerator.generateKey();
 Cipher desCipher;
 desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
 desCipher.init(Cipher.ENCRYPT_MODE, myKey);
 Scanner s = new Scanner(System.in);
 System.out.println("Enter a message : ");
 String msg = s.nextLine();
 byte[] text = msg.getBytes();
 System.out.println("\nMessage : " + new String(text));
 byte[] textEncrypted = desCipher.doFinal(text);+
 System.out.println("\nEncrypted Message: " + textEncrypted);
 desCipher.init(Cipher.DECRYPT_MODE, myKey);
 byte[] textDecrypted = desCipher.doFinal(textEncrypted);
 System.out.println("\nDecrypted Message: " + new String(textDecrypted));
}
catch(NoSuchAlgorithmException e)
{
e.printStackTrace();
}
catch(NoSuchPaddingException e)
{
e.printStackTrace();
}
catch(InvalidKeyException e)
{
e.printStackTrace();
}
catch(IllegalBlockSizeException e)
{
e.printStackTrace();
}
catch(BadPaddingException e)
{
e.printStackTrace();
}
}
}
