package ru.mirea.task5.opt3;
import java.util.Scanner;

public class Sofa extends Furniture
{

    public Sofa(){

    }

    public Sofa(int p, String c)
    {
        this.price=p;
        this.color=c;
        this.setInStock();
    }

    public void setInStock() {
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Диван есть в наличии? (да/нет): ");
        answer=scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА")){
            this.inStock=true;
        }
        else {
            this.inStock=false;
        }
    }

    public String Info()
    {
        return "Диван:\n\tЦвет: "+ getColor()+"\n\tЦена: "+getPrice()+" рублей\n\tНаличие в магазине: "+getInStock();
    }
}