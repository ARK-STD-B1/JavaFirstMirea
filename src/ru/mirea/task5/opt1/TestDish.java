package ru.mirea.task5.opt1;
import java.util.Scanner;

public class TestDish
{
    public static void main(String[] args)
    {
        String plate_color, plate_shape, teapot_color, teapot_type;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Цвет тарелки: ");
        plate_color = scanner.next();
        System.out.print("Форма тарелки: ");
        plate_shape = scanner.next();
        Plate plate = new Plate(plate_color, plate_shape);
        plate.setClean();
        System.out.print("Цвет чайника: ");
        teapot_color = scanner.next();
        System.out.print("Вид чайника: ");
        teapot_type = scanner.next();
        Teapot teapot = new Teapot(teapot_color, teapot_type);
        teapot.setClean();
        System.out.print("\n" + plate.Info() + "\n" + teapot.Info());
    }
}