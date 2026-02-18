
import java.util.Scanner;

public class PasswordStrengthDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        String strength = calculatePasswordStrength(password);
        System.out.println("Password Strength: " + strength);
    }

    private static String calculatePasswordStrength(String password) {
        String strength = "Weak";

        int score = 0;
        if (password.length() >= 8) {
            score++;
        }
        if (password.matches(".*[A-Z].*")) {
            score++;
        }
        if (password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*\\d.*")) {
            score++;
        }
        if (password.matches(".*[!@#$%^&*()].*")) {
            score++;
        }

        if (score >= 4) {
            strength = "Strong";
        } else if ((score >= 2)) {
            strength = "Moderate";
        }

        return strength;
    }
}
