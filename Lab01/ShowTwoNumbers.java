import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second number:"));
        JOptionPane.showMessageDialog(null, "The first number is: " + num1 + " and the second number is: " + num2);
    }
}