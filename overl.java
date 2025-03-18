class overl{
   
    int a(int q,int w)
    {
         return q*w;
    }
    double a(double q,double w)
    {
        return q+w;
    }
   
    public static void main(String args[])
    {
        overl obj=new overl();
     
        System.out.println(obj.a(10,2));
        System.out.println(obj.a(100.2,50.5));
    }
    
    }	
