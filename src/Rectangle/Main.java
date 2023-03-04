package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: "); // nhập độ rộng
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");// nhập chiều cao
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display()); // in lại giá trị vừa nhập
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());//chu vi
        System.out.println("Area of the Rectangle: " + rectangle.getArea());//diện tích
    }
}