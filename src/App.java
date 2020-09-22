public class App {
    static void showSum(double d, double e, int count) {
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

    public static void main(String[] args) throws Exception {
        showSum(7.5, 1.5, 2);
    }
}
