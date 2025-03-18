import java.util.Scanner;
class primn{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Entern the number:");
        int n=ob.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {   f=1;
                System.out.println("It is not a prime number");
            }        
        }
        
         if(f==0)
         {
         
            if(n==1)
             {
                 System.out.println("It is not a prime and nor composite number");
             }
             else{
                 System.out.println("It is a prime number");
               }
        }
         
   
        
    }
    }
