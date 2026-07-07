public final class main {

    public static boolean hasMinLength(String password, int min){
        if (password == null) { // wenn nichts eingegeben wird, wird sofort abgebrochen
            return false;
        }
        char[] passwortBuchstaben = password.toCharArray();

        int zaehler = 0;
        for (char einzelnerBuchstabe : passwortBuchstaben) {
            zaehler++; // Bei jedem Buchstaben wird der Zähler um 1 erhöht!
        }

        if (zaehler >= min) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containsDigit(String password){
        if (password == null) {
            return false;
        }
        char[] buchstaben = password.toCharArray();

        for (char c : buchstaben) {

            if (Character.isDigit(c)){
                return true;
            }

        }
        return false;
    }

    public static boolean containsUpperAndLower(String password){
        if (password == null) {
            return false;
        }
        char[] buchstaben = password.toCharArray();

        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : buchstaben) {
            if (Character.isUpperCase(c)){
                hasUpper = true;
            }
            else if (Character.isLowerCase(c)) {
                hasLower = true;
            }

        }
        return hasUpper && hasLower; // gib true zurück wenn beide stimmen sonst false
    }


    /*

    public static boolean isCommonPassword(String password); // kleine interne Liste
    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed);
    // Optionale Gesamtsicht:
    public static boolean isValid(String password); // nutzt die obenstehenden Checks
    */
}
