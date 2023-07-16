class dhk{
     
    // func is a function used to return calculated value of ((a ^ b) mod P)
    private static long func(long a1, long a2, long x)
    {
        if (a1 == 1)
            return a1;
        else
            return (((long)Math.pow(a1, a2)) % x);
    }
     
    // Main Code
    public static void main(String[] args)
    {
        long Ps, Gs, p, g, q, h, K_A, K_B;
         
        // Both persons agrees on public keys Gs and Ps
         
        // A prime number Ps
        Ps = 23;
        System.out.println("Value of Ps is: " + Ps);
         
        // Gs is primitive root for Ps
        Gs = 9;
        System.out.println("Value of Gs is: " + Gs);
         
        // g is the private key chosen by Joy
        // The chosen private key is g
        g = 4;
        System.out.println("Private key g is: " + g);
         
        // fetches the generated key
        p = func(Gs, g, Ps);
         
        // h will be the chosen private key by Happy
        // The chosen private key is h   
        h = 3;
        System.out.println("Private key h is: " + h);
         
        // fetches the generated key
        q = func(Gs, h, Ps);
         
        // After the exchange of keys, generating the secret key
        K_A = func(q, g, Ps); // Joy's Secret key
        K_B = func(p, h, Ps); // Happy's Secret key
         
        System.out.println("Joy's Secret key is: " + K_A);
        System.out.println("Happy's Secret key is: " + K_B);
      if(K_A==K_B)
             System.out.println("Key exchange is done securely\n");
      else
             System.out.println("Key exchange is not done securely\n");
       
    }
}

