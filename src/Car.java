public class Car implements Vehicle{
    private String model;
    private int days ;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int dayS) {
        this.days = dayS;
    }


    @Override
    public double calculateRentalCost() {
        System.out.println(50*days);
        return 50 *days;
    }


    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: $50.0");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }

    }

