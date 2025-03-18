import java.util.Scanner;
class oe{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            { 
                System.out.print(+i+"\t");
            }
            else{
                System.out.println(+i+"\t");
            }
        }
      }
}
