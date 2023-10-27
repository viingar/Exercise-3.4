import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String firstname = scanner.next();
        System.out.println ("Введите возраст: ");
        Integer firstage = scanner.nextInt();

        User firstuser = new User(firstname, firstage);

        System.out.println("Введите второе имя: ");
        String secondname = scanner.next();
        System.out.println("Введите второй возраст: ");
        Integer secondage = scanner.nextInt();

        User seconduser = new User(secondname,secondage);

        if (firstage < secondage) {
            System.out.println(firstuser.toString());
        } else {
            System.out.println(seconduser.toString());
        }


    }

}
