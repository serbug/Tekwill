package com.serbug;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 3.3 Primitive casting implicit/explicit
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {

        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("\n* Print double variable after implicit cast byte->short->int->long->float->double:\n\t\t\t" + d);

        double doubleNumber = 7.1454545454454E13;
        float float_Double_Cast = (float) doubleNumber;
        long long_Float_Cast = (long) float_Double_Cast;
        int int_Long_Cast = (int) long_Float_Cast;
        short short_Int_Cast = (short) int_Long_Cast;
        byte byte_Short_Cast = (byte) short_Int_Cast;
        char char_Byte_Cast = (char) byte_Short_Cast;

        System.out.println("\n* Print variable after explicit cast double->float->long->int->short->byte->char:");
        System.out.println("\t\t\tInitial double variable: " + doubleNumber);
        System.out.println("\t\t\tFloat -> Double cast: " + float_Double_Cast);
        System.out.println("\t\t\tLong -> Float cast: " + long_Float_Cast);
        System.out.println("\t\t\tInt -> Long cast: " + int_Long_Cast);
        System.out.println("\t\t\tShort -> Int cast: " + short_Int_Cast);
        System.out.println("\t\t\tByte -> Short cast: " + byte_Short_Cast);
        System.out.println("\t\t\tChar -> Byte cast: " + char_Byte_Cast);

    }
}
