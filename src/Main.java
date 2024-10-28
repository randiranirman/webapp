import java.util.*;

abstract class Main extends User {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "Enter Your choice:\n 1-add User \n 2-terminate \n 3-check user list  \n 4-check winner \n Enter Your choice here: ");
            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    new User();
                    System.out.println("here  is the second change");
                    break;

                case 2:
                    System.exit(0);

                    break;
                case 3:
                    System.out.println("hello world !");
                    checkUserList();
                    
                    break;

                case 4:
                    checkWinner();
                    break;
                default:
                    System.out.println("Something went Wrong!");

                    break;
            }

        }

    }

}
