package calculator;

public class BinaryOperation {
    private double arg1;
    private double arg2;
    private BinaryOperator operation;


    public BinaryOperation(BinaryOperator operation, double arg1, double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
    }
    public double getResult(){
        return(operation.apply(arg1, arg2));
    }
}
