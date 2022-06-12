public class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
