import java.util.*;
class volofbox
{
    double height;
    double width;
    double depth;
    void setdim(double h,double w,double d)

    {
        height=h;
        width=w;
        depth=d;
    }
    void calvol()
    {
        System.out.println("Volume is :"+(h*w*d));
    }
}
class boxdim
{
    public static void main(String args[])
    {
        box ab = new box
        ab.setdim(10,20,30);
        ab.calvol();
    }
}

