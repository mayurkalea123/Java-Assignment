interface shape{
    public void pri();
}
class rectangle implements shape
{
    public void pri(){
    System.out.println("rectangle");
    }
}
class triangle implements shape
{
    public void pri(){
    System.out.println("triangle");
    }
}
class inter{
    public static void main(String args[])
    {
        shape a=new triangle();
        a.pri();
    }
}
