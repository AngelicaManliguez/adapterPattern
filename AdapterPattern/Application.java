package AdapterPattern;

import java.util.Scanner;

public class Application {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Laptop laptop = new Laptop();
        PowerOutlet laptopPO = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPO = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneChargerPO = new SmartphoneAdapter(smartphoneCharger);

        char choice;
        do{
            System.out.println("__________________________");
            System.out.println("|\tAVAILABLE DEVICES\t|\n"
                    + "| \t [L] Laptop \t\t|\n"
                    + "| \t [R] Refrigerator \t|\n"
                    + "| \t [S] Smartphone \t|\n"
                    + "| \t [E] Exit \t\t\t|");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.print("Choose device: ");
            choice = scan.next().charAt(0);

            if(choice == 'L' || choice == 'R' || choice == 'S' || choice == 'E')
            {
                switch (choice)
                {
                    case 'L':
                        System.out.println(laptopPO.plugIn());
                        break;
                    case 'R':
                        System.out.println(refrigeratorPO.plugIn());
                        break;
                    case 'S':
                        System.out.println(smartphoneChargerPO.plugIn());
                        break;
                }
            }
            else
            {
                System.out.println("\nInvalid input! Try again.\n");
            }

        }while(choice != 'E');

        System.out.println("\nThank you for using our app! \n"
                            + "ありがとうございます!");
    }
}
