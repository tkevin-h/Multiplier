public class MultiplyByAdd implements MultiplyMethod{

    public int multiplyNumbers(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + a;
        }

        return sum;
    }
}
