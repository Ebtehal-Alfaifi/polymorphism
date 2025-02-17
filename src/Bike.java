public class Bike implements Vehicle{
   // brand, hour.
private String brand;
private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    @Override
    public double calculateRentalCost() {
        System.out.println(10*hour);

        return 10 * hour;
    }

    @Override
    public void displayDetails() {
        System.out.println("bike brand: " + brand);
        System.out.println("Daily Rental Rate: $10");
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
