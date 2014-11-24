/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa.algorithm;

/**
 *importing classes.
 * @author benedict
 */
import java.util.*;
import java.math.BigInteger;
import java.io.IOException;
import java.security.SecureRandom;

//RSA key encryption algorithm implementation.

public class RsaAlgorithm {
   
    SecureRandom rnd = new SecureRandom();
    private BigInteger p,q, n,m, d, e;
    
  /* Putting  an instance in place that can both encrypt and decrypt. */
  
    
     public RsaAlgorithm(int bit)
  {
  /*Selecting two large prime numbers p and q. */  
     p = new BigInteger(bit, rnd);
     q = new BigInteger(bit, rnd);
  /*Calculating for n by multiplying p.q*/ 
    n = p.multiply(q);
    
    /*Calculating for m = (p - 1).(q - 1) */
    BigInteger m = (p.subtract(BigInteger.ONE))
                   .multiply(q.subtract(BigInteger.ONE));
    /*Finding e  such that gcd(e, m) = 1 ; 1 < e < m */
    
    
do
{
e = new BigInteger(2*bit, new Random());
 
}
while( (e.compareTo(m) != 1)
||
(e.gcd(m).compareTo(BigInteger.valueOf(1)) != 0));
   /* e = new BigInteger("3");
    while(m.gcd(e).intValue() >= 1) e = e.add(new BigInteger("2"));
    d = e.modInverse(m);
   */
/* Step 5: Calculate d such that e.d = 1 (mod (m)) */
d = e.modInverse(m);
  }

   public BigInteger encrypt(BigInteger msg) {
      return msg.modPow(e,n);
   }

  public BigInteger decrypt(BigInteger cyphermsg) {
      return cyphermsg.modPow(d,n);
   }    
    public BigInteger displayp(){
        return p;
    }
     public BigInteger displayq(){
        return q;
    }
    public static void main(String[] args) throws IOException{
 //int message = Integer.parseInt(args[0]);
    RsaAlgorithm benedict = new RsaAlgorithm(32);        
//Displaying an output.
  
    System.out.println(benedict.displayp());
    System.out.println(benedict.displayq());
    
    RsaAlgorithm code = new RsaAlgorithm(32);
       
   int msg = 0;
   String s = Integer.toString(msg); 
   System.out.println("Enter the message : ");
    msg = System.in.read();
    
      
    
    BigInteger bmsg;
   BigInteger bcyphermsg;
bmsg = BigInteger.valueOf((long)msg); 
    

bcyphermsg = code.encrypt(bmsg);
System.out.println("Msg : " +  bmsg.toString());
System.out.println("Cyphermsg : " +  bcyphermsg.toString());
 
System.out.println("What do u want to do now? : ");
 bmsg = code.decrypt(bcyphermsg);
System.out.println("After Decryption of Msg : " +  new String(bmsg.toByteArray()));   
    
    
    }
    
    
    
    
    
}
