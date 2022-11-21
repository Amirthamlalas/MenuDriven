import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {
        int ex;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter\n 1 :  for largest of 3\n 2 : for smallest of 3\n 3 : to check prime\n 4 : to check even\n 5 : to find reverse");
            int choice = sc.nextInt();
            switch (choice){

            }
            System.out.println("Do you want to continue:1 for yes 2 for no");

            ex = sc.nextInt();
        }while(ex==1);
    }
}
