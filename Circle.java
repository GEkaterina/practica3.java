import java.math.*;

public class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
    }
    public Circle (double r)
    {
        radius = r;
    }
    public Circle (double r, String c, boolean f)
    {
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    @Override
    public double getArea ()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return Math.PI*2*radius;
    }
    @Override
    public String toString ()
    {
        return " Shape: circle, Radius: " + radius + " Color: " + color;
    }

}