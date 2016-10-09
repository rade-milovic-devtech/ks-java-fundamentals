package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) {


         throwUncheckedException();

        // throwCheckedException();

        // doSomething();
    }


    private static void throwUncheckedException() {
        throw new RuntimeException("Exception message");
    }

//    private static void throwCheckedException(){
//        throw new Exception("Checked exception");
//    }
//
//    private static void doSomething()  {
//
//        try {
//            throwCustomException();
//            tryWithResources();
//        } catch (MyException e) {
//            // log error
//            e.printStackTrace();
//            doSomethingDifferent();
//        } catch (Exception e){
//            // log error
//            e.printStackTrace();
//
//        } finally {
//            // do something either way
//        }
//    }
//    private static String tryWithResources() throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader("somePath")))
//        {
//            return br.readLine();
//        }
//    }
//
//    private static void throwCustomException() {
//        throw new MyException("My custom exception");
//    }
//
//    private static void doSomethingDifferent() {
//        System.out.println("Just to differentiate exception");
//    }


}
