import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestTangent {
    @Test
    public void highBoarderReturnsCorrect(){
        boolean thrown = false;
        try {
            Tangent tangent = new Tangent();
            BigDecimal resultBD = tangent.tg(3*Math.PI/2);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void lowBoarderReturnsCorrect() {
        boolean thrown = false;
        try {
            Tangent tangent = new Tangent();
            BigDecimal resultBD = tangent.tg(-3*Math.PI/2);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void leftBoarderReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(Math.PI);
        Double result = resultBD.doubleValue();
        Assert.assertEquals((Double)0.0, result);
    }

    @Test
    public void rightBoarderReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(0.0);
        Double result = resultBD.doubleValue();
        Assert.assertEquals((Double)0.0, result);
    }

    @Test
    public void firstFourthReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(1.0);
        Double result = resultBD.doubleValue();
        double math = Math.tan(1);
        String mathStr = String.format("%.1f",math);
        String resultStr = String.format("%.1f",result);
        Assert.assertEquals(mathStr, resultStr);
    }

    @Test
    public void secondFourthReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(2.0);
        Double result = resultBD.doubleValue();
        double math = Math.tan(2.0);
        String mathStr = String.format("%.1f",math);
        String resultStr = String.format("%.1f",result);
        Assert.assertEquals(mathStr, resultStr);
    }

    @Test
    public void thirdFourthReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(4.0);
        Double result = resultBD.doubleValue();
        double math = Math.tan(4);
        String mathStr = String.format("%.1f",math);
        String resultStr = String.format("%.1f",result);
        Assert.assertEquals(mathStr, resultStr);
    }

    @Test
    public void fourthFourthReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(5.0);
        Double result = resultBD.doubleValue();
        double math = Math.tan(5);
        String mathStr = String.format("%.1f",math);
        String resultStr = String.format("%.1f",result);
        Assert.assertEquals(mathStr, resultStr);
    }

    @Test
    public void negativeNumberReturnsCorrect(){
        Tangent tangent = new Tangent();
        BigDecimal resultBD = tangent.tg(-34.0);
        Double result = resultBD.doubleValue();
        double math = Math.tan(-34.0);
        String mathStr = String.format("%.1f",math);
        String resultStr = String.format("%.1f",result);
        Assert.assertEquals(mathStr, resultStr);
    }
}
