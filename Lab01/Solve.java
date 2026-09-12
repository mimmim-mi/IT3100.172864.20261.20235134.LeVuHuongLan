import javax.swing.JOptionPane;

public class Solve {
    public static void theFirstDegreeEquation() {
        String strA = JOptionPane.showInputDialog(null, "Enter a: ");
        String strB = JOptionPane.showInputDialog(null, "Enter b: ");
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }

    public static void theSystemOfFirstDegreeEquations() {
        String strA1 = JOptionPane.showInputDialog(null, "Enter a1: ");
        String strB1 = JOptionPane.showInputDialog(null, "Enter b1: ");
        String strC1 = JOptionPane.showInputDialog(null, "Enter c1: ");
        String strA2 = JOptionPane.showInputDialog(null, "Enter a2: ");
        String strB2 = JOptionPane.showInputDialog(null, "Enter b2: ");
        String strC2 = JOptionPane.showInputDialog(null, "Enter c2: ");

        double a1 = Double.parseDouble(strA1);
        double b1 = Double.parseDouble(strB1);
        double c1 = Double.parseDouble(strC1);
        double a2 = Double.parseDouble(strA2);
        double b2 = Double.parseDouble(strB2);
        double c2 = Double.parseDouble(strC2);

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x + ", y = " + y);
        }
    }

    public static void theSecondDegreeEquationWithOneVariable() {
        String strA = JOptionPane.showInputDialog(null, "Enter a: ");
        String strB = JOptionPane.showInputDialog(null, "Enter b: ");
        String strC = JOptionPane.showInputDialog(null, "Enter c: ");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution.");
                }
            } else {
                double x = -c / b;
                JOptionPane.showMessageDialog(null, "The solution is x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "The equation has no real solution.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one real solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two real solutions: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Enter an option :\n1. The first-degree equation\n2.The system of first-degree equations\n3. The second-degree equation with one variable\n");

        switch (option) {
            case "1":
                theFirstDegreeEquation();
                break;
            case "2":
                theSystemOfFirstDegreeEquations();
                break;
            case "3":
                theSecondDegreeEquationWithOneVariable();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option.");
        }
    }
}