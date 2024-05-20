package kadai;

public class Review01 {

    public static void main(String[] args) {
            int num1 = 1500;
            double num2 = 0.1;
            int result;

            result = tax (num1,num2);
            System.out.println((int)num1 + "円の商品の税込価格は"+ ((int)num1 + (int)result) + "円（消費税は"+ (int)result + "円）です。");
        }

        public static int tax(int num1, double num2) {
            int result = (int) (num1 * num2);
            return result;
        }
    }
