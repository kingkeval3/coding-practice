import java.util.Arrays;

public class MaxPositive3Digit {

    public static void main(String[] args){
        Integer threeDigit = 512;
        Integer limit = 10;

        Integer firstDigit = Integer.parseInt(threeDigit.toString().charAt(0)+"");
        Integer secondDigit = Integer.parseInt(threeDigit.toString().charAt(1)+"");
        Integer thirdDigit = Integer.parseInt(threeDigit.toString().charAt(2)+"");

        StringBuilder result = new StringBuilder();

        for(Integer curDigit : Arrays.asList(firstDigit,secondDigit,thirdDigit)){

            while(curDigit!=9 && limit!=0){
                curDigit++;
                limit--;
            }

            result.append(curDigit);

        }

        System.out.println("The max positive 3 digit value: "+result.toString());

    }
}
