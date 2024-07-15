//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CalcItMentor {
    public CalcItMentor() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение. Не более двух положительных чисел от 1 до 10 включительно и математическую операцию с ними. Допустимы только умножение, деление, сложение и вычетание: ");
        String expression = scanner.nextLine();
        expression = expression.replaceAll(" ", ""); // убираю лишние пробелы
        System.out.println(parse(expression));
    }

    public static String parse(String expression) throws Exception {
        String[] operands = expression.split("[+\\-*/]");
        if (operands.length != 2) {
            throw new Exception("Введите выражение. Не более двух положительных чисел от 1 до 10 включительно и математическую операцию с ними. Допустимы только умножение, деление, сложение и вычетание.");
        } else {
            String oper = detecOperation(expression);
            int num1;
            int num2;
                num1 = Integer.parseInt(operands[0]);
                num2 = Integer.parseInt(operands[1]);

            if (num1 <= 10 && num2 <= 10) {
                int res = calc(num1, num2, oper);
                String result;
                    result = String.valueOf(res);

                return result;
            } else {
                throw new Exception("Числа должны быть от 1 до 10");
            }
        }
    }

    static String detecOperation(String expression) {
        if (expression.contains("+")) {
            return "+";
        } else if (expression.contains("-")) {
            return "-";
        } else if (expression.contains("*")) {
            return "*";
        } else {
            return expression.contains("/") ? "/" : null;
        }
    }

    static int calc(int a, int b, String oper) {
        if (oper.equals("+")) {
            return a + b;
        } else if (oper.equals("-")) {
            return a - b;
        } else {
            return oper.equals("*") ? a * b : a / b;
        }
    }
}
