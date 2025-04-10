package FreshCoffee_Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class KoSaiTreeMap {

    public static void main(String[]args){

//         Create a HashMap object called people
		Map<KoSaiPerson, Integer> people = new HashMap<KoSaiPerson, Integer>();

        KoSaiPerson person1 = new KoSaiPerson("a", 1, "aa");
//        KoSaiPerson person2 = person1;
        KoSaiPerson person2 = new KoSaiPerson("a", 1, "aa");

        System.out.println(person1.name.equals(person2.name));
        System.out.println(person2.equals(person1));
        System.out.println(person1.getClass());
        System.out.println(person2.getClass());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


		// Add keys and values (Name, Age)
		people.put(person1, 1);
		people.put(person2, 2);

        people.put(new KoSaiPerson("a",1,"aa"),5);

		people.put(new KoSaiPerson("b", 1, "bb"), 3);
		people.put(new KoSaiPerson("c", 1, "cc"), 4);

		System.out.println("people size" + people.size());

        Map<Integer,Integer> IDandMarks = new HashMap<>();
        IDandMarks.put(1000, 100);
        IDandMarks.put(1000, 100);
//        IDandMarks.put(1000, 200);
        IDandMarks.put(2000, 200);

        System.out.println(IDandMarks);
        System.out.println("IDMARKS : "+IDandMarks.size());

        System.out.println("KoSaiTreeMap : ");

//        Comparator<KoSaiPerson> AgeComparator = new SortByAge();
        Comparator<KoSaiPerson> AgeNameComparator = new SortByAge().thenComparing(new SortByName());
//        Comparator<KoSaiPerson> fullComparator = new SortByAge().thenComparing(new SortByName()).thenComparing(new SortByFatherName());

//        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(AgeComparator);
        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(AgeNameComparator);
//        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(fullComparator);

        koSaiTreeMap.put(new KoSaiPerson("LP", 20,"PP"), 1);
        koSaiTreeMap.put(new KoSaiPerson("LP", 20,"LL"), 1);

        koSaiTreeMap.put(new KoSaiPerson("lwin", 20,"PP"), 1);
        koSaiTreeMap.put(new KoSaiPerson("phyo", 20,"PP"), 1);

        System.out.println("size is : "+koSaiTreeMap.size());
        System.out.println(koSaiTreeMap);
    }
}

class KoSaiPerson{
    String name;
    int age;
    String FatherName;

    KoSaiPerson(String name,int age,String FatherName){
        this.name = name;
        this.age = age;
        this.FatherName = FatherName;
    }

    @Override
    public String toString() {
        return "KoSaiPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", FatherName='" + FatherName + '\'' +
                '}';
    }
}

class SortByAge implements Comparator<KoSaiPerson>{
    @Override
    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
        return o1.age - o2.age;
    }
}

class SortByName implements Comparator<KoSaiPerson>{
    @Override
    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByFatherName implements Comparator<KoSaiPerson>{
    @Override
    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
        return o1.FatherName.compareTo(o2.FatherName);
    }
}


