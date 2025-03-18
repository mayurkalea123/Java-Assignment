class A
{
    void aa()
    {
        System.out.println("Hi");
    }
  
}

class B extends A
{   void bb(){
    System.out.println("By");
    }
}
   
class C extends A
{    void cc(){
    System.out.println(" Good By");}
}

class D extends A
{   void dd(){
    System.out.println("By By");}
}


class hera
{
    public static void main(String args[])
    {        
       B ob1=new B();
       C ob2=new C();
       D ob3=new D();
       ob1.aa();
       ob1.bb();
       ob2.cc();
       ob3.dd();
        
    }
}
