abstract class A{
   abstract void display();
}
class B extends A{
    void display()
    {
        System.out.println("I am b class");
    
    }
}
class abst{
    public static void main(String args[])
    { 
       B b=new B();
       b.display();
    }
}
