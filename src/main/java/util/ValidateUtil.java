package util;

public class ValidateUtil {

    public static boolean isValidAge(int age){
        return age > 0 && age < 10;
    }

    public static boolean isValidWeight(double weight){
        if (weight == Double.NaN){
            return false;
        }
        if (weight == Double.POSITIVE_INFINITY){
            return false;
        }
        return weight > 0 && weight < 12.0;
    }

    public static boolean isValidName(String name){
        return name.length() > 0 && name.length() < 15;
    }
}
