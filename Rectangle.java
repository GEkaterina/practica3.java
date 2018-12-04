public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
    }
    public Rectangle (double w, double l)
    {
        width = w;
        length = l;
    }
    public Rectangle (double w, double l, String c, boolean f)
    {
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    public double getWight()
    {
        return width;
    }
    public void setWight (double w)
    {
        width =w;
    }
    public double getLenght()
    {
        return length;
    }
    public void setLenght (double l)
    {
        length = l;
    }

    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return 2*(width);
    }
    @Override
    public String toString()
    {
        return " Shape: Rectangle, Wight: " + width + " Lenght:" + length + " Color: " + color;
    }

}