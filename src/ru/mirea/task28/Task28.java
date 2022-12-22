package ru.mirea.task28;

public class Task28
{
    public String brand, model, type;
    private final Wheels wheels = new Wheels("Toyo");

    public Task28() { }

    Task28(String brand, String model)
    {
        this.brand=brand;
        this.model=model;
    }

    Task28(String brand, String model, String type)
    {
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("Звук двигателя");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        @Override
        public String toString() {
            return "Wheels {" +
                    " manufacturer = '" + manufacturer + '\'' +
                    '}';
        }
    }

    public static class Hatchback extends Task28 { //Вложенный статический класс
        Hatchback(String brand, String model) {
            super(brand, model);
            setType("Hatchback");
        }
    }

    public class GT extends Task28 { //Вложенный класс
        GT(String brand, String model) {
            super(brand, model);
            setType("Gran Turismo");
        }

        public void engineSound(){
            System.out.println("Громкий звук двигателя");
        }
    }

    public static void main(String[] args) {

        Task28 hatchback = new Hatchback("Audi", "A7 Sportback");
        Task28 notAnonGTCar = new Task28().new GT("Toyota", "Supra");
        Task28 anonGTCar = new Task28("Mercedes", "AMG GT4", "Gran Turismo") { //Анонимный класс
            @Override
            public void engineSound()
            {
                System.out.println("Громкий звук двигателя");
            }
        };

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(hatchback.toString());
        hatchback.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(anonGTCar.toString());
        anonGTCar.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(notAnonGTCar.toString());
        notAnonGTCar.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
    }


    @Override
    public String toString() {
        return "Auto {" +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}