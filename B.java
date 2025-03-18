class A{
    int id;
    String name;
    A()
    {
       System.out.println("Hello");
    }
    A(int i,String n)
    {
        id=i;
        name=n;
        System.out.println(id+"  "+name);
    }
    A(A a)
    {
        id =a.id;
        name=a.name;
        System.out.println(id+"  "+name);
    
    }
    }
    
class B{
    public static void main(String args[])
    {
        A ob=new A();
        A ob1=new A(1,"Mayur");
        A ob2= new A(ob1);
    
    }

}

