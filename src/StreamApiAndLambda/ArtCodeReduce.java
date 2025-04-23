package StreamApiAndLambda;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ArtCodeReduce {

    public static void main(String[]args){

        List<String> greetings = List.of("Hello","Hi","Hey","Hola","How yo Doing");

        greetings.stream()
//                .reduce((greeting1, greeting2) -> greeting1.length()>greeting2.length() ? greeting1 : greeting2);
//                .map(String::toUpperCase)
                .mapToDouble(String::length)
                .forEach(System.out::println);
//                .reduce((g1,g2)->g1+" "+g2);
//        System.out.println(longestGreeting.get());
//        concactG.ifPresent(System.out::println);



        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);
        int summation = integerList.stream()
//                .reduce(0,((n1,n2)->n1+n2));
        .reduce(1,(n1,n2)->n1*n2);
        System.out.println("total res : "+ summation);

        //OLD way
        int sum = 0;
        for(int n : integerList){
            sum += n;
        }
        System.out.println(" sum is : " + sum);

        List<Car> carList = Car.getCarList();
        double totalCarPrice = carList.stream()
                .filter(c->c.getModelYear()>2015)
                .mapToDouble(Car::getPrice)
                .reduce(0,(n1,n2)->n1+n2);
        System.out.println("Total double price is : "+totalCarPrice);
    }
}
