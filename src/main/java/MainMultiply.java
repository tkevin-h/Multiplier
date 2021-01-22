public class MainMultiply {
    public static void main(String[] args) {
        int a = 11;
        int b = 24;
        int result;

        MultiplyMethod m = new MultiplyByStar();
        result = m.multiplyNumbers(a, b);
        System.out.println(result);

        m = new MultiplyByAdd();
        result = m.multiplyNumbers(a, b);
        System.out.println(result);
    }
}
