package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue;
        System.out.println("longValue="+longvalue);

        doublevalue = intvalue;
        System.out.println("doubleValue="+doublevalue);

        doublevalue = 20L;
        System.out.println("doubleValue2="+doublevalue);
    }
}
