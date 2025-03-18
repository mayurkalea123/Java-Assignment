class A{
    void display()
    {
        System.out.println("Sanjivani Concert");
        
    }

}
class B extends A{
    void display()
    {
        super.display();
        System.out.println("Computer");
    }

}
class fest{
    public static void main(String args[])
    {
        B ob=new B();
        ob.display();
    }

}
