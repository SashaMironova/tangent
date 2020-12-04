import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tangent {
    public BigDecimal tg(Double number) {

        double[] bernulli = new double[17];
        bernulli[1] = 1.0 / 6;
        bernulli[2] = -1.0 / 30;
        bernulli[3] = 1.0 / 42;
        bernulli[4] = -1.0 / 30;
        bernulli[5] = 5.0 / 66;
        bernulli[6] = -691.0 / 2730;
        bernulli[7] = 7.0 / 6;
        bernulli[8] = -3617.0 / 510;
        bernulli[9] = 43867.0 / 798;
        bernulli[10] = -174611.0 / 330;
        bernulli[11] = 854513.0 / 138;
        bernulli[12] = -236364091.0 / 2730;
        bernulli[13] = 8553103.0/6;
        bernulli[14] = -23749461029.0/870;
        bernulli[15] = 8615841276005.0/14322;
        bernulli[16] = -7709321041217.0/510;

        BigDecimal result = new BigDecimal(0);
        if (number < 0 && Math.abs(number) % (Math.PI/2) != 0){
            number = Math.PI * 10000000- Math.abs(number);
        }
        if (Math.abs(number) > Math.PI) {
            number = number % (Math.PI);
        }
        if (Math.abs(number) > Math.PI/2){
            number = Math.PI - number;
            number = - number;
        }
        if (Math.abs(number) % (Math.PI/2) == 0 && number != 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i < 17; i++) {
            BigDecimal n = (BigDecimal.valueOf(bernulli[i] * Math.pow(-4, i) * (1 - Math.pow(4, i)) * Math.pow(number, (2 * i - 1)))).divide(factorial(2 * i), 20, RoundingMode.HALF_UP);
            BigDecimal newResult = result.add(n);
            result = newResult;
        }
        if (number == 0) {
            result = BigDecimal.valueOf(0);
        }

        System.out.println("Полученный результат: " + result);
        return result;
    }


    static BigDecimal factorial(int n){
        BigDecimal result = new BigDecimal(1);
        for (int i = 1; i <=n; i ++){
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }
}
