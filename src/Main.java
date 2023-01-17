public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("M5"),
                createObject("benz"),
                createObject("camry")};

        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "M5":
                Bmw m5= new Bmw("BMW ", "m5", 2021,4.0,"зимние");;
                return m5;
            case "benz":
                Mersedes benz= new Mersedes("Mersedes", "benz", 2002,220,"кожанный");
                return benz;
            case "camry":
                Toyota camry= new Toyota("Toyota", "camry", 2010,"white","12000km");
                return camry;
        }
        return null;
    }

}