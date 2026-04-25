package Class4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// interface Human
// {
//     void run();
// }

// // @FunctionalInterface
// interface Animal
// {
//     public void increaseSpeed(int x);
// }
public class learnFI {
    public static void main(String[] args) {
        // Animal lion = (int x)-> {
        //     System.out.println("Increasing the Speed by "+x);
        // };
        // lion.increaseSpeed(10);
        Consumer<Integer> myFirstFI = (Integer x)->{
            System.out.println("I recevied a Argument "+x);
        };

        myFirstFI.accept(10);

        Consumer<String> stringConsumerFi = (String str)->{
            System.out.println("I received a String "+str);
        };

        stringConsumerFi.accept("IPL");

        Supplier<Integer> supplierOfInteger = ()->{
            return 10;
        };

        System.out.println(supplierOfInteger.get());
        System.out.println(supplierOfInteger.get());
        // int count=0;
        final int [] count = {0};
        Supplier<String> supplierOfString = ()->{
            if(count[0]==0)
                return "A";
            else if(count[0]==1)
                    return "B";
            else if(count[0]==2)
                return "C";
            else if(count[0]==3)
                return "D";
            else
                return "Z";
        };

        System.out.println(supplierOfString.get());
        count[0]++;
        System.out.println(supplierOfString.get());
        count[0]++;
        System.out.println(supplierOfString.get());
        count[0]++;
        System.out.println(supplierOfString.get());
        count[0]++;
        System.out.println(supplierOfString.get());

        Function<Integer,String> fiIntToString = (Integer x)->{
            return "IPL";
        };
        System.out.println(fiIntToString.apply(10));
        Function<String,Integer> fiStringToInt = (String str)->{
            return 10;
        };
        // System.out.println(functionalFi.apply(10));
        System.out.println(fiStringToInt.apply("Lion"));

        Predicate<String> myFirstPredicate = (String str)->{
            return true;
        };

        System.out.println(myFirstPredicate.test("IPL"));

        Predicate<String> isGreaterThan10 = (String str)->{
            if(str.length()>10)
                return true;
            else
                return false;
        };

        System.out.println(isGreaterThan10.test("HOIHFIOUGUIFGOUQE"));
        System.out.println(isGreaterThan10.test("LION"));

    }
}    
