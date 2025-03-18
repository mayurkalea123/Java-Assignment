interface shape{
    public void pri();
}
interface size
{
    public void display(){
    System.out.println("rectangle");
    }
}
class triangle implements shape,size
{
    void pri(){
    System.out.println("triangle");
    }
    void display(){
        System.out.println("shape");
    }
    
}
class inter{
    public static void main(String args[])
    {
        shape a=new triangle();
        a.pri();
        size a=new triangle();
        a.display();
        
    }
}
