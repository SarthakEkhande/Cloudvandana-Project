
public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over 545t  he lazy dog"; 
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
