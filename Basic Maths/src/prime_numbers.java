public class prime_numbers {
    public static void main(String[] args) {
        //a number divisible by 1 and itself
        //no of divisor is 2
        //optimal approach
        //time complexity is O(sqrt(n))
        //space complexity is O(1)
        int cnt=0;
         int num=34;
         for(int i=1;i*i<num;i++)
         {
             if(num%i==0)
                 cnt++;
             if(num/i!=i)
                 cnt++;
         }
         if(cnt==2) {
             System.out.println("true");
         }
         else
             System.out.println("false");
    }
}
