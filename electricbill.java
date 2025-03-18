import java.util.Scanner;
class electricbill{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Entern the number:");
        
        int u=ob.nextInt();
        int total=0;
        if(u<=100)
        {
            total=u*4;
            System.out.println("The Total unit is:"+total);
        }
        else if(u>100 && u<=200)
        {   int b=200-u;
            if(b==0)
            {
                total=(100*4) + (100*5);
                System.out.println("The Total unit is:"+total);
            }
            else
            {   
                total=(100*4) + (b*5);
                System.out.println("The Total unit is:"+total);
            }
        }
        else if(u>200)
        {   int b=300-u;
           if(b==0)
           {
           
              total=(100*4) + (100*5) + (100*6);
              System.out.println("The Total unit is:"+total);
            }
            else{
            
                total=(100*4) + (100*5) + (b*6);
                System.out.println("The Total unit is:"+total);
            }
        }
        else{
            System.out.print("--");
        }
    
    
    
    }
    
    }
