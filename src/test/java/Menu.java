import java.util.Scanner;

public class Menu {
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        String menu = ("\n This is program menu. Please choose one of the options: \n" +
                "1 – Print sum of all employees salary \n" +
                "2 – Display all employees data \n" +
                "3 – Add new employee \n" +
                "4 – End program \n");
        System.out.println(menu);
        while (sc.hasNextInt()) {
            int menuNumber = sc.nextInt();
            switch (menuNumber) {
                case 1:
                    PayRoll.sumOfAllSalaries();
                    System.out.println(menu);
                    break;
                case 2:
                    PayRoll.getAllData();
                    System.out.println(menu);
                    break;
                case 3:
                    PayRoll.addEmployee();
                    System.out.println(menu);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}