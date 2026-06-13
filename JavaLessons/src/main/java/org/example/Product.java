package org.example;

/**
 * 3. Товар в магазине
 * Цель: объединение нескольких полей, конструктор с параметрами, метод для скидки.
 *
 * Создайте класс Product:
 *
 * Поля: String name, double price, int quantity (количество на складе).
 *
 * Конструктор, принимающий название и цену (количество при создании равно 1).
 *
 * Метод void applyDiscount(double percent) — уменьшает цену на заданный процент (проверить, чтобы цена не стала отрицательной).
 *
 * Метод void sell(int amount) — уменьшает quantity на amount, если товара достаточно; если нет — выводит сообщение об ошибке.
 *
 * Метод void restock(int amount) — увеличивает количество на складе.
 *
 * Метод void printInfo() — выводит полную информацию о товаре.
 *
 * В main() создайте несколько товаров, попробуйте продать, пополнить склад, применить скидку.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }
    /**
     * Метод void applyDiscount(double percent) — уменьшает цену на заданный процент (проверить, чтобы цена не стала отрицательной).
     */
    public void applyDiscount(double percent){
       double newPrice = price - (price / 100 * percent);
       if (newPrice >= 0){
           price = newPrice;

       }
    }
    /**
     * Метод void sell(int amount) — уменьшает quantity на amount, если товара достаточно; если нет — выводит сообщение об ошибке.
     */
    public void sell(int amount){
        int newQuantity = quantity - amount;
        if (newQuantity >= 0){
            quantity = newQuantity;
        } else{
            System.out.println("Not enough quantity");
        }


    }
    /**
     *Метод void restock(int amount) — увеличивает количество на складе.
     */
    public void restock(int amount){
        if(amount > 0){
            quantity = quantity + amount;
        }
    }
    /**
     * Метод void printInfo() — выводит полную информацию о товаре.
     */
    public void printInfo(){
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
        System.out.println();
    }

}
