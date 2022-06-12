public class SomeClass implements ReversedString{
   private static String str;

    public SomeClass(String str) {
        this.str=str;
    }
    //Easy method reverse
//    @Override
//    public String reverse() {
//        StringBuilder stringBuilder = new StringBuilder(str);
//
//        return String.valueOf(stringBuilder.reverse().toString());
//    }

    @Override
    public String reverse(){
        char[] ch=str.toCharArray();
        String rev="";
        for (int i = ch.length-1; i >=0; i--) {
            rev+=ch[i];

        }
        return rev;
    }
}
