class constru{
    int id;
    String name;
    constru()
    {
        System.out.println("Iam an constructor");
    }
    constru(int i,String n)
    {
        id=i;
        name=n;
        System.out.println(id+"  "+name);
    }
    public static void main(String args[])
    { 
        constru obj1=new constru();
        constru obj2=new constru(10,"Mayur");
    }
    
    }
