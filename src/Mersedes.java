public class Mersedes extends Car implements Printable{
    private int maximalSpeed;
    private String salon;

    public Mersedes(String name, String model, int year, int maximalSpeed, String salon) {
        super(name, model, year);
        this.maximalSpeed = maximalSpeed;
        this.salon = salon;
    }
    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public String getSalon() {
        return salon;
    }



    @Override
    public void print() {
        System.out.println(getInfo()+ "\nmaximal speed: " + getMaximalSpeed()+
                "\nsalon: " + getSalon() );
    }
}