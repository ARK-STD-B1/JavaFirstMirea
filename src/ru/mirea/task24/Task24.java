package ru.mirea.task24;

public class Task24
{
    public static void main(String[] args)
    {
        String[] S = new String[4];
        String IPADDRESS_PATTERN = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        S[0] = "127.0.0.1";
        S[1] = "255.255.255.0";
        S[2] = "1300.6.7.8";
        S[3] = "abc.def.gha.bcd";

        for (int i = 0; i < S.length; i++)
        {
            if (S[i].matches(IPADDRESS_PATTERN))
            {
                System.out.println("Строка является IP адресом");
            }
            else
            {
                System.out.println("Строка не является IP адресом");
            }
        }
    }
}