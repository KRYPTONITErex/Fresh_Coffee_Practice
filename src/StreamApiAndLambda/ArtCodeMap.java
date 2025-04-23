package StreamApiAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class ArtCodeMap {

    public static void main(String[]args){

        List<Integer> mapInt = Arrays.asList(1,2,3,4,5,6,7,8);
        DoubleStream douResult = DoubleStream.of(mapInt.stream()
                .mapToDouble(n->n*n)
                        .sum());
//                .forEach(System.out::println);
//        System.out.println(douResult);
//        douResult.forEach(System.out::println);
        douResult.forEach(n->System.out.println(n));

        System.out.println("=====================================");

        List<Car> carUppList = Car.getCarList();
        carUppList.stream()
                .map(c->c.getBrand().toUpperCase())
                .forEach(System.out::println);

        System.out.println("=====================================");

        List<Car> avgCarPrice = Car.getCarList();
        OptionalDouble avgRes = avgCarPrice.stream()
                .mapToDouble(c->c.getPrice())
                .average();
//                .ifPresent(System.out::println);
        avgRes.ifPresent(System.out::println);

    }
}
