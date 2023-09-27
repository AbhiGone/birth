import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int birthMonth;
        System.out.println("what is your birth month number (1-12)");
        birthMonth = scan.nextInt();

        if(birthMonth > 0 && birthMonth <= 12){
            System.out.println("your birth month is " + birthMonth);
        }else {
            System.out.println("you have entered an inncorrect birth month \"" + birthMonth + "\"");
        }
    }
}