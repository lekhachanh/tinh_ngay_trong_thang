import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang ban muon dem ngay!");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30 days";
                break;
            default:
                dayInMonth = " ";
        }
        if (dayInMonth != " ") {
            System.out.printf("the month %d has %s", month, dayInMonth);
        }else {
            System.out.println("input wrong month!");
        }

    }
}
