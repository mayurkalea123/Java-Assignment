class A{
    void display(){
        System.out.println("Hi");
    }
    void calculate()
    {
        System.out.println(10*1);
    }
}
class B extends A{
    void display(){
        System.out.println("Hello");
    }
    void calculate(){
        System.out.println(11*1);
    }
    void addition()
    {
        int a=12;
        int b=13;
        int c=a+b;
        System.out.println(c);
    }
    void f()
    {
        super.display();
        super.calculate();
    }
    
}
class q1{
    public static void main(String args[])
    {
        B obj=new B();
        obj.display();
        obj.calculate();
        obj.addition();
        obj.f();
    }
}
