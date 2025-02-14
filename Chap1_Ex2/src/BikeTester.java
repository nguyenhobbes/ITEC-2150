import java.util.ArrayList;

class Bike{
    private int wheels;
    private String manufacturer;
    private int year;

    public Bike(){
        this.wheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    public Bike(int wheels, String manufacturer, int year){
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getYear() {
        return this.year;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Wheels: " + this.wheels + "\nManufacturer: " + this.manufacturer + "\nYear: " + this.year;
    }
}

public class BikeTester {
    public static void main(String[] args){
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());

        Bike bike2 = new Bike();
        bike2.setManufacturer("BMW");
        bike2.setYear(1995);

        ArrayList<Bike> bikeList = new ArrayList<Bike>();
        bikeList.add(bike1);
        bikeList.add(bike2);

        int sumWheels = 0;
        int minYear = 3000;
        for (Bike bike : bikeList) {
            System.out.println(bike.toString());
            sumWheels += bike.getWheels();
            if (bike.getYear() < minYear)
                minYear = bike.getYear();
        }

        System.out.println("Total wheels: " + sumWheels);
        System.out.println("Oldest bike: " + minYear);
    }
}



