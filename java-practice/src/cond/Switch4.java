package cond;


public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            case 4 -> 4000;
            default -> 0;
        };
        System.out.println("받은쿠폰" + coupon);
    }
}