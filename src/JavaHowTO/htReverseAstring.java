package JavaHowTO;

public class htReverseAstring {

    public static void main(String[]args){

        String originalStr = "Hello Universe";
        String reversedStr = "";

        for( int i = 0 ; i < originalStr.length(); i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println(reversedStr);

        String myName = "KO LWIN PHYO";
        String reversedName = " ";

        for(int i=0; i<myName.length(); i++){
            reversedName = myName.charAt(i)+reversedName;
        }
        System.out.println(reversedName);
    }
}
