class A
{
    int a=10;
  
}

class B extends A
{
   int a=20;
   void d()
   {
       
       System.out.println(a);
        System.out.println(super.a);
   }
   }
   
class s{
    public static void main(String args[])
    {   
      
        B obj1=new B();
        obj1.d();
    }
    }
