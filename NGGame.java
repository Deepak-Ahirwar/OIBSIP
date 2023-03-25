import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

class NGGame {
	public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);        
	int start = 1,end = 100;
	int total_Attempts = 5;
        int winning_score = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(end-start+1)+start;
	JOptionPane.showMessageDialog(null,"Number Guessing Game");

        for (int i=start;i<=total_Attempts;i++) {
	    String number = JOptionPane.showInputDialog("Guess number between in range"+start+"to"+end+"-->");
            int guessNumber = Integer.parseInt(number);
	    if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations you won in"+i+"attempts");
                winning_score = total_Attempts - i + 1;
                break;
            }
            else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Guess number is less than random number Please try once more");

            }
            else {
                JOptionPane.showMessageDialog(null, "Guess number is greater than random number please try once more");
            }

        }
	JOptionPane.showMessageDialog(null, "Final score --> "+winning_score);
    }
}