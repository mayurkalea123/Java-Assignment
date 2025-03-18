import java.util.Scanner;

class a{
   
         int roll;
         String name;
     
         void insert()
         {
               roll=61;
               name="mayur";
         
         }
     
     };
class b extends a{
    
         void display()
         {
             System.out.println(roll+" "+name);
         }
        
};
class s-inher{
    public static void main(String args[])
    {
     
         b d=new b();
         d.insert();
         d.display();
}
};
