public abstract class Shape {
    protected String color;
    protected boolean filled;


    public Shape() {
    }

    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        filled = f;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return " Color: " + color;
    }

}