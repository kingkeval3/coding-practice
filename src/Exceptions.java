import java.util.Arrays;

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        System.out.println( s );
    }
}

//Throw/Throws
class ConstructorEx{

    String a;
    String b;

    public ConstructorEx(String a, String b){
        this.a = a;
        this.b = b;
    }

    void handleException() throws InterruptedException {
        if(a!=b){
            throw new InterruptedException();
        }
    }

}

public class Exceptions {

    public static void main(String[] args) throws InterruptedException {
        try {

            Integer eid = 5;

            if(!Arrays.asList(1,2,3).contains(eid)){
                throw new MyException("Employee Identification Mismatch");
            }

        }catch (MyException me){
            System.out.println("Handle User defined Exception");
            throw new NullPointerException();
        }

        ConstructorEx ce = new ConstructorEx("kmj","abc");
        ce.handleException();


    }

}

