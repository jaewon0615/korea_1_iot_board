package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();
        System.out.print("입력한 문자열:"+str);

        System.out.print("정수를 입력하세요:");
        int value = scanner.nextInt();
        System.out.print("입력한 정수:"+value);

        System.out.print("실수를 입력하세요:");
        double values = scanner.nextDouble();
        System.out.print("입력한 실수:"+values);
    }
}
