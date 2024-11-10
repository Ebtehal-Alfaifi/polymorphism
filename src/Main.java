import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Vehicle> rentedVehicles = new ArrayList<>();
        int choice=0;

        while (choice!=5) { // طالما انها لا تساوي 5
        System.out.println("Vehicle Rental System");
        System.out.println("1. Rent a Car");
        System.out.println("2. Rent a Bike");
        System.out.println("3. Rent a Truck");
        System.out.println("4. View Rented Vehicles");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice  = scanner.nextInt();


switch (choice){
    case 1:
        System.out.println("Enter Car Model: ");
        String carModel = scanner.next();
        System.out.println("Enter Rental Days: ");
        int carDays = scanner.nextInt();
        scanner.nextLine(); // سطر جديد
        Car car = new Car(carModel, carDays);
        rentedVehicles.add(car);   // خزنتها في المصفوفة الي انشئتها
        System.out.println("Rental cost :");
        car.calculateRentalCost();
        // استدعيت الميثود الي محفوظة فيها التفاصيل
        break;

    case 2:
        System.out.println(" enter Bike Brand");
        scanner.nextLine();
        String bikebrand=scanner.nextLine();
        System.out.println(" enter bike hours");
        int renthour=scanner.nextInt();
        Bike bike=new Bike(bikebrand,renthour); // poly
        rentedVehicles.add(bike);
        System.out.println(" rental cost ");
        bike.displayDetails();

         break;

    case 3:
        System.out.print("Enter Truck Type: ");
        scanner.nextLine();
        String truckType = scanner.nextLine();
        System.out.print("Enter Rental Weeks: ");
        int truckWeeks = scanner.nextInt();
        Truck truck = new Truck(truckType, truckWeeks);
        rentedVehicles.add(truck);
        System.out.println("Rental cost :");
        truck.calculateRentalCost();
        break;

    case 4:
        System.out.println("Rented Vehicles:");
        for (Vehicle v : rentedVehicles) {
            v.displayDetails();
            System.out.println();
        }
        break;

    case 5:
        System.out.println("Thank you ,Good bye!");
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
}
        }


    }}
