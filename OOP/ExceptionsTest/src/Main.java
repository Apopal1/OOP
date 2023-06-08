import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter a number for male students");
        int men = keyboard.nextInt();
        System.out.println("Enter a number for female students");
        int women = keyboard.nextInt();

        try {
            if (men==0 && women == 0){
                throw new Exception("There is no students, the class is canceled");
            } else if (men==0) {
                throw new Exception("There are no men, the class is canceled");
            } else if (women==0) {
                throw new Exception("There are no women, the class is canceled");
            }

            if (women>men){
                System.out.println("Each man must dance with " + women/(double)men + "Women");
                System.out.println("Begin the lesson");
            }
            else System.out.println("Each women must dance with"+ men/(double)women + "men");
            System.out.println("Begin the lesson");
        }catch (Exception e){
            String message= e.getMessage();
            System.out.println(message);
    }
      //System.out.println("Begin the lesson");
    }
}