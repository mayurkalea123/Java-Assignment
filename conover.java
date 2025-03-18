class conover{
    int id;
    String name;
    String result;
    conover()
    {
        System.out.println("Iam an constructor");
    }
    conover(int i,String n)
    {
        id=i;
        name=n;
        System.out.println(id+"  "+name);
    }
    conover(int i,String n,String b)
    {
        id=i;
        name=n;
        result=b;
        System.out.println(id+"  "+name+" "+result);
    }
    public static void main(String args[])
    { 
        conover obj1=new conover();
        conover obj2=new conover(61,"Mayur");
        conover obj3=new conover(61,"M","Pass");
        
    }
    
    }
