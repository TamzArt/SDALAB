package lab2;
public class Rectangle {
    private double length;
    private double width;


    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }


    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }


    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }


    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }


    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


    public double perimeter() {
        return 2 * (length + width);
    }


    public double area() {
        return length * width;
    }


    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle();
            System.out.println("Default Length: " + rect.getLength());
            System.out.println("Default Width: " + rect.getWidth());
            System.out.println("Perimeter: " + rect.perimeter());
            System.out.println("Area: " + rect.area());

            rect.setLength(5.0);
            rect.setWidth(3.0);
            System.out.println("\nAfter setting new dimensions:");
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Perimeter: " + rect.perimeter());
            System.out.println("Area: " + rect.area());


            try {
                rect.setLength(25.0);  
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                rect.setWidth(-5.0);  
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
