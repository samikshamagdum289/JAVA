abstract class shape
{
   public double dim1,dim2;
    shape(double d1,double d2)
    {
        dim1=d1;
        dim2=d2;
    }
abstract double area();
}
class triangle extends shape
{
    triangle(double d1,double d2)
    {
        super(d1,d2);
    }
    double area()
    {
        return(0.5*dim1*dim2);
    }
}
class rectangle extends shape
{
    rectangle(double d1,double d2)
    {
        super(d1,d2);
    }
    double area()
    {
        return(dim1*dim2);
    }
}
class abstractclassarea
{
    public static void main(String args[])
    {
        shape s;
        triangle t=new triangle(10,20);
        s=t;
        System.out.println("Triangle area:"+s.area());

        rectangle r =new rectangle(10,20);
        s=r;
        System.out.println("rectangle area:"+s.area());
     }
}
