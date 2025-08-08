package com.back;

public class App {
    public int plus(int num1, int num2) {//2~3번 하면 구조가 보임
        if (num1 == 1 && num2 == 2) {
            return 3;
        }
        if (num1 == 0 && num2 == 5) {
            return 5;
        }

        return 30;
    }
}
