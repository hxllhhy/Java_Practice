public class 链式异常 {
    public static void main(String[] args) {
        int n = 20, result = 0;
        try {
            result = n/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }
}
