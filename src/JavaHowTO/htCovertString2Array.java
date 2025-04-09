package JavaHowTO;

public class htCovertString2Array {

    public static void main(String[]args){

        String laptopName = "MacBook Air M3";
        char[] myArray = laptopName.toCharArray();

        System.out.println(myArray[0]);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+"  ");
        }
        System.out.println();
        System.out.println(myArray.length);


        for(char c : myArray){
            System.out.print(c + " - ");
        }


        String myName = "KO LWIN PHYO";
        char[] nameArray = myName.toCharArray();
        System.out.println();
        System.out.print(nameArray);
        System.out.println();
        for(char c : nameArray){
            System.out.print(c + "/");
        }

    }
}

