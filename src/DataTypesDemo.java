public class DataTypesDemo {
    public static void main(String[] args) {
        byte b=65;
        short s=654;
        int i=546545;

        long l=65421;

        double d=6542.3;
        float f=65421.2f;

        System.out.println(b);
        System.out.println("byte has "+ Byte.BYTES +" bytes");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        System.out.println(s);
        System.out.println("short has "+ Short.BYTES +" bytes");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(i);
        System.out.println("int has "+ Integer.BYTES +" bytes");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(l);
        System.out.println("long has "+ Long.BYTES +" bytes");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

    }
}
