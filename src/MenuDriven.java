import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {
        int ex;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter\n 1 : For largest of 3\n 2 : For smallest of 3\n 3 : To check prime\n 4 : To check even\n 5 : To find reverse");
            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    int n1,n2,n3;
                    System.out.println("Enter 3 numbers");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    n3 = sc.nextInt();
                    if((n1>n2)&&(n1>n3)){
                        System.out.println("Largest is : "+n1);

                    } else if (n2>n3) {
                        System.out.println("Largest is : "+n2);

                    }
                    else{
                        System.out.println("Largest is : "+n3);
                    }
                break;
                case 2:
                    int a,b,c;
                    System.out.println("Enter 3 numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                    if((a<b)&&(a<c)){
                        System.out.println("smallest is : "+a);

                    } else if (b<c) {
                        System.out.println("smallest is : "+b);

                    }
                    else{
                        System.out.println("smallest is : "+c);
                    }

            }
            System.out.println("Do you want to continue:1 for yes 2 for no");

            ex = sc.nextInt();
        }while(ex==1);
    }
}
