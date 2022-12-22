package ru.mirea.task23;

import java.util.Objects;

class CPU
{
    private String brand;
    private String model;
    private String kernel;
    private int frequency;
    private String socket;
    private int price;

    public CPU(String brand, String model, String kernel, int frequency, String socket, int price)
    {
        this.brand = brand;
        this.model = model;
        this.kernel = kernel;
        this.frequency = frequency;
        this.socket = socket;
        this.price = price;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU that = (CPU) o;
        if (kernel != that.kernel) return false;
        if (frequency != that.frequency) return false;
        if (socket != that.socket) return false;
        return model.equals(that.model);
    }

    @Override
    public int hashCode()
    {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + price;
        result = 31 * result + frequency;
        return  result;
    }

    @Override
    public String toString()
    {
        return "CPU {" +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", kernel = '" + kernel + '\'' +
                ", frequency = " + frequency +
                ", socket = '" + socket + '\'' +
                ", price = " + price +
                ", hash = " + hashCode() +
                '}';
    }
}

class Intel extends CPU
{
    public Intel(String brand, String model, String kernel, int frequency, String socket, int price)
    {
        super(brand, model, kernel, frequency, socket, price);
    }
}

class AMD extends CPU
{
    public AMD(String brand, String model, String kernel, int frequency, String socket, int price)
    {
        super(brand, model, kernel, frequency, socket, price);
    }
}

public class Task23
{
    public static void compareCPU(CPU cpu1, CPU cpu2)
    {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(cpu1.toString());
        System.out.println(cpu2.toString());
        if (cpu1.hashCode() == cpu2.hashCode() && cpu1.equals(cpu2))
        {
            System.out.println("Объекты равны");
        }
        else
        {
            System.out.println("Объекты не равны");
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args)
    {
        CPU[] cpu = new CPU[5];
        cpu[0] = new Intel("Intel", "Core I9 10940X", "Cascade Lake", 4, "LGA 2066", 69990);
        cpu[1] = new AMD("AMD", "Ryzen 9 7950X", "Raphael", 5, "SocketAM5", 68990);
        cpu[2] = new Intel("Intel", "Core I7 12700K", "Alder Lake", 4, "LGA 1700", 36590);
        cpu[3] = new AMD("AMD", "Ryzen 7 7700X", "Raphael", 4, "SocketAM5", 38990);
        cpu[4] = new Intel("Intel", "Core I9 10940X", "Cascade Lake", 4, "LGA 2066", 69990);

        int m = 1;
        for (int i = 0; i < 5; i++)
        {
            for (int j = m; j < 5; j++)
            {
                compareCPU(cpu[i], cpu[j]);
            }
            m++;
        }
    }
}
