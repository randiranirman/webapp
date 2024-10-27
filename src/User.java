import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class User {
      static  Participant participant1 = new Participant("Anura Kumara", "JVP");
      static  Participant participant2 = new Participant("Sajith Premadasa", "JVP");
      static  Participant participant3 = new Participant("Ranil Wickremesinghe ", "UNP");
      static  Participant participant4 = new Participant("Namal Rajapakshe ", "NLP");

    private String name;
    private String state;
    private int age;
    private String idNumber;
    public static ArrayList<User> users = new ArrayList<>();

    static void checkUserList() {
        for (User user : users) {

            System.out.print(user.getName() + " ");
            System.out.print(user.getState() + " ");
            System.out.print(user.getAge() + " ");
            System.out.print(user.getIdNumber() + " ");
            System.out.print("\n");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public int getAge() {
        return this.age;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public static boolean checkUser(String idNumber) {
        return users.stream().noneMatch(user -> user.idNumber.equals(idNumber));
    }

    static void checkWinner() {

        ArrayList<Integer> countList = new ArrayList<>();
        countList.add(participant1.count);
        countList.add(participant2.count);
        countList.add(participant3.count);
        countList.add(participant4.count);

        if ((participant1.count > participant2.count) && (participant1.count > participant3.count)
                && (participant1.count > participant4.count)) {
            System.out.println("winner is " + participant1.getName());

        } else if ((participant2.count > participant1.count) && (participant2.count > participant3.count)
                && (participant2.count > participant4.count)) {
            System.out.println("Winner is " + participant2.getName());
        } else if ((participant3.count > participant1.count) && (participant3.count > participant2.count)
                && (participant3.count > participant4.count)) {
            System.out.println("Winner is " + participant3.getName());

        } else {
            System.out.println("Winner is " + participant4.getName());
        }
                
        System.out.println(participant1.count);
        System.out.println(participant2.count);
        System.out.println(participant3.count);
        System.out.println(participant4.count);

    }

    public User() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the  full name of the User: ");
        this.name = scan.nextLine();
        boolean validInput= false;
        try {
            while (!validInput) {
                System.out.print("Enter the age : ");
                this.age = scan.nextInt();
                if (this.age > 18 && this.age < 100) {
                    validInput= true;
                    
                } else {
                    System.out.println("Age should be under 100 and higher 18 ");
                    
                }
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Age should be a number !");
            scan.next();
            

        }

        System.out.print("Enter the state: ");
        scan.nextLine(); // Consume newline
        this.state = scan.nextLine();
        // checking the ID number is valid or not
        try {
            while (true) {
                System.out.print("Enter the ID number: ");
                this.idNumber = scan.nextLine();
                if (this.idNumber.length() == 12 | this.idNumber.length() == 10) {
                    break;
                } else {
                    System.out.println("Please Enter a valid ID ");
                    continue;
                }

            }
        } catch (Exception e) {

            System.out.println("Something  was Wrong !");
        }

        if (checkUser(this.idNumber)) {
            users.add(this);
            System.out.println("User successfully added!");
        } else {

            System.out.println("User already exists, please check again!");

        }

        System.out.print("Choose Your Candidate: ");
        int choice;
        choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1:
                System.out
                        .println("You have chosen participant 1  " + participant1.getName() + participant1.getParty());
                participant1.count++;

                break;

            case 2:
                System.out.println("You have chosen participant 2 " + participant2.getName() + participant2.getParty());
                participant2.count++;
                break;

            case 3:
                System.out
                        .println("You have chosen participant 3  " + participant3.getName() + participant2.getParty());
                participant3.count++;
                break;

            case 4:
                System.out.println("You have chosen participant 4" + participant4.getName() + participant2.getParty());
                participant4.count++;
                break;

        }

    }

}
