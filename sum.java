class nn{
    public static void main(String args[])
    {
        int n=100;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum1+=i;
                System.out.print(+i+"\t");
            }
            else{
                sum2+=i;
                System.out.println(+i+"\t");
             }
        }
        System.out.println("\nThe sum of even number is:"+sum1);
        System.out.println("The sum of odd number is:"+sum2);
        
    
    }
}
