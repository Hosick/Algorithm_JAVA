package baekjoon_step.step2_If;

import java.util.Scanner;

public class Code_2753 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}