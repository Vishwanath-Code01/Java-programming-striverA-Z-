public class printallprimefactors {
    public static void main(String[] args) {
        //print all the prime factors of a given number
        int n=7;
        for (int i=2;i*i<=n;i++)//optimal approach as i iterated till sqrt of n
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
         while(n%i==0)
         {
             n=n/i;
         }
        }
        if(n!=1)  // if a given number is a prime number then directly checks this condition
        {
            System.out.println(n);
        }
    }
}
