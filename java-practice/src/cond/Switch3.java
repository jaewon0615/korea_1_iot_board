package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 400;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            case 400:
                coupon = 5000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("받은쿠폰" + coupon);
    }
}
