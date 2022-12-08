public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;


    public Car() {
        this("default","default",1.5,"белый",2000,"default");
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль марки " + brand + ", модель " + model + ", " + productionYear + " года выпуска," +
                " страна сборки " + productionCountry + ", цвет " + color + ", объем двигателя — " + engineVolume
                + " л.";
    }
}
