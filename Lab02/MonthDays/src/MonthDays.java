import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int month = 0;
        int year = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Month: ");
            String monthInput = keyboard.nextLine().trim();

            System.out.print("Year: ");
            String yearInput = keyboard.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);

                if (year < 0) {
                    System.out.println("Invalid year. Please enter again.");
                    continue;
                }

                String m = monthInput.toLowerCase();

                switch (m) {
                    case "1":
                    case "january":
                    case "jan":
                    case "jan.":
                        month = 1;
                        break;

                    case "2":
                    case "february":
                    case "feb":
                    case "feb.":
                        month = 2;
                        break;

                    case "3":
                    case "march":
                    case "mar":
                    case "mar.":
                        month = 3;
                        break;

                    case "4":
                    case "april":
                    case "apr":
                    case "apr.":
                        month = 4;
                        break;

                    case "5":
                    case "may":
                        month = 5;
                        break;

                    case "6":
                    case "june":
                    case "jun":
                    case "jun.":
                        month = 6;
                        break;

                    case "7":
                    case "july":
                    case "jul":
                    case "jul.":
                        month = 7;
                        break;

                    case "8":
                    case "august":
                    case "aug":
                    case "aug.":
                        month = 8;
                        break;

                    case "9":
                    case "september":
                    case "sep":
                    case "sep.":
                        month = 9;
                        break;

                    case "10":
                    case "october":
                    case "oct":
                    case "oct.":
                        month = 10;
                        break;

                    case "11":
                    case "november":
                    case "nov":
                    case "nov.":
                        month = 11;
                        break;

                    case "12":
                    case "december":
                    case "dec":
                    case "dec.":
                        month = 12;
                        break;

                    default:
                        System.out.println("Invalid month. Please enter again.");
                        continue;
                }

                valid = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter again.");
            }
        }

        int days;

        switch (month) {
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            default:
                days = 31;
        }

        System.out.println("Number of days: " + days);
    }
}