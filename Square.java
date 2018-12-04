public class Square extends Rectangle
{
    protected double side;

    public Square()
    {
    }
    public Square (double s)
    {
        side = s;
    }
    public Square (double s, String c, boolean f)
    {
        side = s;
        color = c;
        filled = f;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide (double s)
    {
        side = s;
    }
    public void setWidth (double side)
    {
        width = side;
    }
    public void setLength (double side)
    {
        length = side;
    }
    @Override
    public String toString()
    {
        return " Shape: Square, Side: " + side + " Color: " + color;
    }


}