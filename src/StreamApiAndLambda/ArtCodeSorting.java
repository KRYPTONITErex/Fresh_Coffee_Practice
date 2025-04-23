package StreamApiAndLambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArtCodeSorting {

    public static void main(String[]args){

        List<Car> carList = getCarList();
//        System.out.println(carList.getFirst().getBrand());

//        List<Car> sortedCarList = carList.stream()
//                .sorted(Comparator.comparing(Car::getPrice).reversed().thenComparing(Car::getBrand))
//                .collect(Collectors.toList());
////        System.out.println(sortedCarList);
//        sortedCarList.forEach(System.out::println);

        List<Car> maxCarBrand = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed().thenComparing(Car::getBrand))
                .limit(4)
                .collect(Collectors.toList());
        maxCarBrand.forEach(System.out::println);

    }

    public static List<Car> getCarList(){
        return List.of(
                new Car("BMW", 2010, 10000),
                new Car("Mercedes", 2015, 20000),
                new Car("MG", 2016, 20000),
                new Car("Audi", 2018, 30000),
                new Car("Toyota", 2020, 40000),
                new Car("Honda", 2022, 50000)
        );
    }
}

class Car{
    private String brand;
    private int modelYear;
    private double price;

    public Car(String brand, int modelYear, double price){
        this.brand = brand;
        this.modelYear = modelYear;
        this.price = price;
    }

    public static List<Car> getCarList() {
        return List.of(
                new Car("BMW", 2010, 10000),
                new Car("Mercedes", 2015, 20000),
                new Car("MG", 2016, 20000),
                new Car("Audi", 2018, 30000),
                new Car("Toyota", 2020, 40000),
                new Car("Honda", 2022, 50000)
        );
    }

    public String getBrand(){return brand;}
    public int getModelYear(){return modelYear;}
    public double getPrice(){return price;}

    public String toString(){
//        return brand + " " + modelYear + " \t- " + price;
        return String.format("%-10s %-10d %-10d", brand, modelYear, price);
    }
}