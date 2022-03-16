/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

/**
 *
 * @author Asus
 */
public class Main {
    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Square square1 = new Square(5);
        System.out.println("==== Square ====");
        System.out.println("Square = " + square1.getSide());
        System.out.println("Area = " + square1.getArea());
    }
}
