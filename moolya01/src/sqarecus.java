class sqaure
    //Create a class square with a method to initialize the side and calculating the area and parameter
{
    public double setarea(double sidelength)
    {
       double area = sidelength * sidelength;
       return area;
    }
    public double setparmeter(double sidelength )
    {
        double area = 8*sidelength;
        return area;
    }
}
public class sqarecus {
    public static void main(String[] args)
    {
        sqaure sq = new sqaure();

        System.out.println(sq.setarea(4));
        System.out.println(sq.setparmeter(10));


    }
}
