import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用整数计算器！");

        // 提示用户输入两个数字和操作符
        System.out.print("请输入第一个数字：");
        long num1 = scanner.nextLong();

        System.out.print("请输入操作符 (+, -, *, /)：");
        String operator = scanner.next();

        System.out.print("请输入第二个数字：");
        long num2 = scanner.nextLong();

        long result = 0;
        boolean valid = true;

        // 根据操作符执行相应的运算
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // 除法运算可能会除数为 0 的情况
                if (num2 == 0) {
                    System.out.println("错误：除数不能为 0！");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("错误：无效的操作符，请输入 (+, -, *, /)");
                valid = false;
                break;
        }

        // 输出结果
        if (valid) {
            System.out.println("计算结果：" + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}