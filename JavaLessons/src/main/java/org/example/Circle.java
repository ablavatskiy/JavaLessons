package org.example;

/**
 * 4. Круг
 * Цель: работа с методами, которые вычисляют значения на основе состояния (полей), но сами состояние не меняют (понятие чистых функций/геттеров вычисляемых).
 * <p>
 * Создайте класс Circle:
 * <p>
 * Поле double radius.
 * <p>
 * Конструктор, принимающий радиус (должен быть больше 0, иначе установить 1.0).
 * <p>
 * Метод double getArea() (π·r²).
 * <p>
 * Метод double getCircumference() (2·π·r).
 * <p>
 * Метод void scale(double factor) — умножает радиус на коэффициент (если коэффициент ≤ 0 — сообщение об ошибке).
 * <p>
 * Метод boolean isBiggerThan(Circle other) — сравнивает площади двух кругов, возвращает true, если текущий круг больше.
 * <p>
 * Для проверки в main() создайте два круга, выведите их площади, измените радиус одного и снова сравните.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;

        } else {
            this.radius = 1.0;
        }

    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    /**
     * Метод void scale(double factor) — умножает радиус на коэффициент (если коэффициент ≤ 0 — сообщение об ошибке).
     */
    public void scale(double factor) {
        if (factor > 0) {
            radius = radius * factor;
        } else {
            System.out.println("Factor must be more than zero");
        }

    }
    /**
     *Mетод boolean isBiggerThan(Circle other) — сравнивает площади двух кругов, возвращает true, если текущий круг больше.
     */
    public boolean isBiggerThan(Circle other){
        if(this.getArea() > other.getArea()){
            return true;
        }
        return false;
    }


}
