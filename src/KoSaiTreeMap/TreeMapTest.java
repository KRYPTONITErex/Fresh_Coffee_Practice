//package KoSaiTreeMap;
//
//import java.util.Map;
//import java.util.TreeMap;
//
//public class TreeMapTest {
//
//    public static void main(String[]args){
//        System.out.println("KoSaiTreeMap : ");
//
////        java.util.Comparator<KoSaiPerson> AgeComparator = new SortByAge();
////        java.util.Comparator<KoSaiPerson> AgeNameComparator = new SortByAge().thenComparing(new SortByName());
//        java.util.Comparator<KoSaiPerson> fullComparator = new SortByAge().thenComparing(new SortByName()).thenComparing(new SortByFatherName());
//
////        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(AgeComparator);
////        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(AgeNameComparator);
//        Map<KoSaiPerson,Integer> koSaiTreeMap = new TreeMap<>(fullComparator);
//
//        koSaiTreeMap.put(new KoSaiPerson("LP", 20,"PP"), 1);
//        koSaiTreeMap.put(new KoSaiPerson("LP", 20,"LL"), 1);
//
//        koSaiTreeMap.put(new KoSaiPerson("lwin", 20,"PP"), 1);
//        koSaiTreeMap.put(new KoSaiPerson("phyo", 20,"PP"), 1);
//
//        System.out.println("size is : "+koSaiTreeMap.size());
//    }
//}
//
//class KoSaiPerson{
//    String name;
//    int age;
//    String FatherName;
//
//    KoSaiPerson(String name,int age,String FatherName){
//        this.name = name;
//        this.age = age;
//        this.FatherName = FatherName;
//    }
//}
//
//class SortByAge implements java.util.Comparator<KoSaiPerson>{
//    @Override
//    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
//        return o1.age - o2.age;
//    }
//}
//
//class SortByName implements java.util.Comparator<KoSaiPerson>{
//    @Override
//    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}
//
//class SortByFatherName implements java.util.Comparator<KoSaiPerson>{
//    @Override
//    public int compare(KoSaiPerson o1, KoSaiPerson o2) {
//        return o1.FatherName.compareTo(o2.FatherName);
//    }
//}
//
//
