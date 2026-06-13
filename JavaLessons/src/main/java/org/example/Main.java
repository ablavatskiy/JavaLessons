package org.example;

/**
 * Для проверки в main() создайте два круга, выведите их площади, измените радиус одного и снова сравните.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15.2);
        Circle circle2 = new Circle(15.2);
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
        circle.scale(2.3);
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle.isBiggerThan(circle2));







    }
}

