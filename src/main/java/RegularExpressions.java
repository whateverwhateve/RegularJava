
import java.util.regex.Pattern;

public class RegularExpressions {

    static boolean isIP(String s)
    {
        String ipPattern = "^(([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])$";
        return Pattern.matches(ipPattern, s);
    }

    static boolean isGUID(String s)
    {
        String guidPattern = "^(\\{[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}}|" +
                "[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12})$";
        return Pattern.matches(guidPattern, s);
    }
    static boolean isURL(String s)
    {
        String guidPattern = "^(https?://)?(www\\.)?([a-zA-Z][-a-zA-Z0-9]*[a-zA-Z]\\.)+[a-zA-Z]{2,}" +
                "(:(\\\\d{1,4}|[1-5]\\\\d{4}|6[0-4]\\\\d{3}|65[0-4]\\\\d{2}|655[0-2]\\\\d|6553[0-6]))?";
        return Pattern.matches(guidPattern, s);
    }
    static boolean isStrongPassword(String s)
    {
        String guidPattern = "^(?=\\w*[0-9])(?=\\w*[A-Z])(?=\\w*[a-z])\\w{8,}$";
        return Pattern.matches(guidPattern, s);
    }
}
