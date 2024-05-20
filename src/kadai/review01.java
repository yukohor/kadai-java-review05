package kadai;

public class review01 {

    public static void main(String[] args) {
        double num1 = 1500;
        double num2 = 0.1;
        double result;

        result = addSum (num1,num2);
        System.out.println((int)num1 + "円の商品の税込価格は"+ ((int)num1 + (int)result) + "円（消費税は"+ (int)result + "円）です。");
    }

    public static double addSum(double num1, double num2) {
        double result = (int)num1 * num2;
        return result;
    }
}
