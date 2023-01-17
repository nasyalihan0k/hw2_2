public class Toyota extends Car implements Printable{
    private String color;
    private String mileage;

    public Toyota(String name, String model, int year, String color, String mileage) {
        super(name, model, year);
        this.color = color;
        this.mileage = mileage;
    }
    public String getColor() {
        return color;
    }

    public String getMileage() {
        return mileage;
    }



    @Override
    public void print() {
        System.out.println( getInfo()+"\nColor: "+ getColor() +
                "\nMileage: "+ getMileage());

    }
}