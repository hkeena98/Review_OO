package calculator;

public class PowerOperator extends BinaryOperator{
    @Override
    public double apply(double arg1, double arg2){
        return Math.pow(arg1, arg2);
    }
}

