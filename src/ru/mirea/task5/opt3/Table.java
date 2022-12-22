package ru.mirea.task5.opt3;
import java.util.Scanner;

public class Table extends Furniture
{
    public Table()
    {

    }

    public Table(int p, String c)
    {
        this.price=p;
        this.color=c;
        this.setInStock();
    }

    public void setInStock()
    {
        Scanner input=new Scanner(System.in);
        String answer;
        System.out.print("Стол есть в наличии? (да/нет): ");
        answer=input.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА") || answer.equals("дА")){
            this.inStock=true;
        }
        else {
            this.inStock=false;
        }
    }

    public String Info()
    {
        return "Стол:\n\tЦвет: "+ getColor()+"\n\tЦена: "+getPrice()+" рублей\n\tНаличие в магазине: " + getInStock();
    }
}