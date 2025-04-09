package JavaExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    public static void main(String[]args){

        ArrayList<String> phoneBrands = new ArrayList<>();
        phoneBrands.add("Samsung");
        phoneBrands.add("iPhone");
        phoneBrands.add("Vivo");
        phoneBrands.add("Oppo");
        phoneBrands.add("Vivo");



        Iterator<String> it = phoneBrands.iterator();
//        System.out.println(it.next());

        while (it.hasNext()){
            String brand = it.next();
            if(brand.equals("Vivo")){
                it.remove();
            }
        }
        System.out.println(phoneBrands);
    }
}
