//super keyword
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
   
class C extends B
{

    void aa()
    {
        d();
    }

}
class sa
{
    public static void main(String args[])
    {        
       ///obj1=new B();
       C ob=new C();
       ob.d();
       ob.aa();
       
        
    }
}
