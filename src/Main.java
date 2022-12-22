import transport.Car;

public class Main {
    public static void main(String[] args) {


        Car carLada = new Car("Lada", "Granta", "Желтый", "Россия", 2015, 1.7f,"Механика", "Седан", 4, 1234, "Зимняя");
        Car carAudi = new Car("Audi", "A8 50 L TDI quat", "Черный", "Германия", 2020, 3.0f,"Автомат", "Спорт", 4, 5678, "Летняя");
        Car carBMW = new Car("BMW", "Z8", "Черный", "Германия", 2021  , 3.0f,"Механика", "Седан", 4, 9012, "Зимняя");
        Car carKia = new Car("Kia", "Sportage 4-го поколения", "Красный", "Южная Корея", 2018 , 2.4f,"Автомат", "Хэтчбек", 4, 3456, "Летняя");
        Car carHy = new Car("Hyundai", "Avante", "Оранжевый", "Южная Корея", 2016 , 1.6f,"Механика", "Хэтчбек", 4, 7890, "Зимняя");

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(carHy);

    }
}