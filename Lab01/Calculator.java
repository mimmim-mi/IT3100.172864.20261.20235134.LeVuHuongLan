import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog(null, "Enter first number: ");
        String strNum2 = JOptionPane.showInputDialog(null, "Enter second number: ");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        String strOperator = JOptionPane.showInputDialog(null, "Enter operator (+, -, *, /): ");
        double result = 0;

        switch (strOperator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Division by zero");
                    System.exit(0);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Invalid operator");
                System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}