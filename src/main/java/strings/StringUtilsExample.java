package strings;
import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringUtilsExample {
    public static final String DATE_FORMAT = "MMM dd, yyyy HH:mm a";
    public static String convertDateToString(Date date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        Instant instant = date.toInstant();
        LocalDateTime ldt = instant
                .atZone(ZoneId.of("CET"))
                .toLocalDateTime();
        String formattedDate = ldt.format(formatter);
        return formattedDate;
    }

    public static void main(String[] args){


        String name = "   charan          ";
        String A = "A";
        String I = "I";

        System.out.println(StringUtils.isEmpty(name));
        System.out.println(StringUtils.trimToEmpty(name).toUpperCase());
        Customer customer = new Customer();
        String code = customer.getCustomerCode();
        String code2 = customer.getCountryCode();
        System.out.println(A.equalsIgnoreCase("a"));
        System.out.println(I.equalsIgnoreCase("F"));

        System.out.println(convertDateToString(new Date()));

    }
}
