import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;


interface MyInterface{

}

interface MyInterface2{

}

class Methods{

    void printSomething(){
        System.out.println("Hello!");
    }

    void helloMate(String... name){

        for(String s : name){
            System.out.println(s);
        }

    }

}

public class JavaSessions {

    public static void main(String[] args) throws InterruptedException, MyException {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = myObj.nextLine();
        System.out.println("Enter second string:");
        String s2 = myObj.nextLine();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();


        Boolean flag = true;


        Integer s1Index = 0;
        Integer s2Index = 0;

        String finalOpStr = "";

        while(flag){

            Integer compareResult = Character.compare(
                    Character.toLowerCase(s1Array[s1Index]),
                    Character.toLowerCase(s2Array[s2Index]));

            if(compareResult==0){
                finalOpStr = finalOpStr + s1Array[s1Index];
            }

            if(compareResult<0){
                finalOpStr = finalOpStr + s1Array[s1Index];
            }

            if(compareResult>0){
                finalOpStr = finalOpStr + s2Array[s2Index];
            }


            if((s1Index+1) == s1Array.length){

                for(int i = s2Index; i<s2Array.length ; i++){
                    finalOpStr = finalOpStr + s2Array[i];
                }
                flag = false;
            }else if((s2Index+1) == s2Array.length){
                for(int i = s1Index; i<s1Array.length ; i++){
                    finalOpStr = finalOpStr + s1Array[i];
                }
                flag = false;
            }

            s1Index = (compareResult == 0 || compareResult < 0) ? s1Index+1 : s1Index;
            s2Index = compareResult > 0 ? s2Index + 1 : s2Index ;

        }
        System.out.println(finalOpStr.toUpperCase());
    }

}