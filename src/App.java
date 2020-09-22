public class App {
    static void showSum(double d, double e, int count) { // no return value
        float sum = (float) (d + e);
        if (count < 1) {
            System.out.println("count smaller 1!");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(sum);
            }
            return;
        }
    }

    static double calculateInterest(double amt, double rate, int years) {
        return amt * rate * years;
    }

    public static void main(String[] args) throws Exception {
        // showSum(7.5, 1.5, 2);
        double result = calculateInterest(1.5, 2.5, 3);
        System.out.println(result);
    }
}
