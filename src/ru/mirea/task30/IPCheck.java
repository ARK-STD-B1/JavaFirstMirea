package ru.mirea.task30;
import java.util.regex.Pattern;

public class IPCheck
{
    static String IPADDRESS_PATTERN = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    static boolean checkIP(String str)
    {
        return Pattern.matches(IPADDRESS_PATTERN, str);
    }
}
