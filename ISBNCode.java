public class ISBNCode {
    static String normalizeCode(String raw) {
        raw = raw.trim();
        String publisher = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);
        return publisher + rest;
    }
    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(code.substring(0, 3));
        sb.append("] YEAR: ");
        sb.append(code.substring(3, 7));
        sb.append(" | CATALOG: ");
        sb.append(code.substring(7, 13));
        return sb.toString();
    }

    public static void main(String[] args) {
        String raw = " pen2026004251 ";
        String code = normalizeCode(raw);
        System.out.println(validateAndFormat(code));
    }
}
