package ru.mirea.task29;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CurrencyInfo implements Serializable
{
    @Serial
    private static final long serialVersionUID=1L;
    Date date;
    String currencyName;
    double value;

    public CurrencyInfo(String currencyName, double value) {
        this.date = new Date();
        this.currencyName = currencyName;
        this.value=value;
    }

    @Override
    public String toString() {
        return "CurrencyInfo {" +
                " date = " + date +
                ", currencyName = '" + currencyName + '\'' +
                ", value = " + value +
                " }";
    }
}