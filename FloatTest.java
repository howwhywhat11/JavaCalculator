public class FloatTest {
    public static void main(String[] args) {
        // 1. 0.01 * 100
        float result1 = 0.01f * 100;
        System.out.println("0.01 * 100 = " + result1);

        // 2. 把 0.01 相加 100 次
        float sum = 0.0f;
        for (int i = 0; i < 100; i++) {
            sum += 0.01f;
        }
        System.out.println("把 0.01 相加 100 次 = " + sum);

    }
}