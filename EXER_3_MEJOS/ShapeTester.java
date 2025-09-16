public class ShapeTester{
    public static void main(String[] args) {
        
        Shape circle = new Circle(8.0f);
        System.out.println(circle.DisplayInfo());  

        Shape rectangle = new Rectangle(5.0f, 7.0f);
        System.out.println(rectangle.DisplayInfo());

        Shape square = new Square(9.0f);
        System.out.println(square.DisplayInfo());

        Shape triangle = new Triangle(2.0f, 3.0f, 4.0f);
        System.out.println(triangle.DisplayInfo());

    }
}
