public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "III"; 
        int result = romanToInt(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue;

            switch (currentSymbol) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    return -1; // Invalid input
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
