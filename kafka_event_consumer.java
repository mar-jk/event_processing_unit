// Rectangle.java
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);
        System.out.println("Area: " + rect.area());
    }
}
