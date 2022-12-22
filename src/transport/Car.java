package transport;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private int regNumber;
    private final int seatsAmount;
    private boolean isWinterTires;


    public Car(String brand, String model, String color, String productionCountry, int productionYear, float engineVolume, String transmission, String bodyType, int seatsAmount, int regNumber, String Tires) {

        if (bodyType == null || bodyType.isBlank()) this.bodyType = "default";
        else this.bodyType = bodyType;
        if (regNumber <= 0) this.regNumber = 0;
        else this.regNumber = regNumber;

        if (seatsAmount <= 0) this.seatsAmount = 0;
        else this.seatsAmount = seatsAmount;
        if (brand == null) this.brand = "default";
        else this.brand = brand;

        if (model == null) this.model = "default";
        else this.model = model;

        if (productionCountry == null) this.productionCountry = "default";
        else this.productionCountry = productionCountry;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        if (color == null) this.color = "белый";
        else this.color = color;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;

        if (Tires == "Зимняя") this.isWinterTires = true;
        else this.isWinterTires = false;

    }

    public void changeTires(int month) {
        isWinterTires = month < 12 && month > 2;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isWinterTires() {
        return isWinterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.isWinterTires = winterTires;
    }

    public String toString() {
        return "марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume
                + " цвет кузова:" + color + " год пр-ва:" + productionYear + " страна сборки:" + productionCountry
                + " регистрационный номер: " + regNumber + " кол-во мест: " + seatsAmount + " Коробка передач: " + transmission +
                " зимняя резина: " + isWinterTires +"тип кузова: " + bodyType;
    }
}


