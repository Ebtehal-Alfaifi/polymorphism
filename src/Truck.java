public class Truck implements Vehicle{

//    type , week.

    private String type;
    private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        System.out.println(500*week);

        return week*500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $500.0");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
