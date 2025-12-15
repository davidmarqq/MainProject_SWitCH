package isep.switchdev;

public class Validator {

    public static boolean isNullOrBlank(String... strings) {
        boolean isInvalid = false;

        for (String toValidate : strings) {
            if (toValidate == null || toValidate.isBlank()) {
                isInvalid = true;
            }

        }

        return isInvalid;
    }
}
