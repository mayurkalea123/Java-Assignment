import java.util.Scanner;

class cube{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re;
        int b=n;
        int sum=0;
       
        while(n>0)
        {
            re=n%10;
            sum+=(re*re*re);
            n=n/10;
        }
        if(b==sum)
        {   
             System.out.print("it is an anmstrong num:"+sum);
        }
        else{
            System.out.print("it not an anmostrom:");
        }
    }



}

