import java.io.*;
import java.math.*;
import java.util.*;
public class rsa
{
 private BigInteger p,q,N,phi,e,d;
 private int bitlen=100;
 private Random r;
 public rsa()
 {
  r = new Random();
  p = BigInteger.probablePrime(bitlen,r);
  q = BigInteger.probablePrime(bitlen,r);
  System.out.println("Prime number p = "+p);
  System.out.println("Prime number q = "+q);
  N = p.multiply(q);
  phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
  e = BigInteger.probablePrime(bitlen/2,r);
  while(phi.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
  {
   e.add(BigInteger.ONE);
  }
    System.out.println("Public key    :  "+e);
    d = e.modInverse(phi);
    System.out.println("Private key    :  "+d);
 }
public rsa(BigInteger e, BigInteger d, BigInteger N)
{
 this.e = e;
 this.d = d;
 this.N = N;
}
public static void main(String args[]) throws IOException
{
 rsa rs = new rsa();
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 //DataInputStream in = new DataInputStream(System.in);
 String testString;
 System.out.println("Enter the plain text (maxLen=25) : ");
 testString = in.readLine();
 System.out.println("Encrypted string : "+testString);
  System.out.println("String in bytes  : "+bytesToString(testString.getBytes()));
  byte[] encrypted = rs.encrypt(testString.getBytes());
  byte[] decrypted = rs.decrypt(encrypted);
  System.out.println("Decrypted bytes  : "+bytesToString(decrypted));
  System.out.println("Decrypted string : "+new String(decrypted));
}
private static String bytesToString(byte[] encrypted)
{
 String test=" ";
 for(byte b:encrypted)
 {
  test+=Byte.toString(b);
 }
 return test;
}
private byte[]encrypt(byte[]message)
{
 return (new BigInteger(message)).modPow(e,N).toByteArray();
}
private byte[]decrypt(byte[]message)
{
 return (new BigInteger(message)).modPow(d,N).toByteArray();
}
}
