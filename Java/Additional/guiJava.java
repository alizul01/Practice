import javax.swing.*;
import java.util.Random;

public class guiJava {
    public static void main(String[] args) {
     int computerNumber = (int) (Math.random() * 100 + 1);
     int userAnswer = 0;
     System.out.println("The correct guess would be " + computerNumber);
     int counter = 1;

        while (userAnswer != computerNumber) {
            userAnswer = Integer.parseInt(JOptionPane.showInputDialog("Guess the number"));
            if (userAnswer > computerNumber) {
                JOptionPane.showMessageDialog(null, "Too high");
            } else if (userAnswer < computerNumber) {
                JOptionPane.showMessageDialog(null, "Too low");
            } else {
                JOptionPane.showMessageDialog(null, "You got it!");
            }
            counter++;
        }
        
        JOptionPane.showMessageDialog(null, "It took you " + counter + " tries");
    }
}
