import java.util.Scanner;
class in{
    public static void main(String args[])
    {
        String name;
        int roll,cc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name:");
        name=sc.nextLine();
        System.out.println("Enter your roll no:");
        roll=sc.nextInt();
        System.out.println("Enter your cgpa:");
        cc=sc.nextInt();
        System.out.println(name,roll,cc);
        
   
    }
}
