public class Primitive {

    public static boolean toPrimitive(Boolean b) {
        //NullPointerException control
        if (b == null) {
            return false;
        }
        return b;
    }
}
