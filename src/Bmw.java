public class Bmw extends Car implements Printable {
    private double volume;
    private String tires;

    public Bmw(String name, String model, int year, double volume, String tires) {
        super(name, model, year);
        this.volume = volume;
        this.tires = tires;
    }


    public double getVolume() {
        return volume;
    }

    public String getTires() {
        return tires;
    }



    @Override
    public void print() {
        System.out.println(getInfo()+"\nVolume: " + getVolume() +
                "\nTires: " +getTires() );
    }
}