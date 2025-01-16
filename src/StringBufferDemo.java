public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("madam");

        String s="madam";


        if(sb.reverse().toString().equals(s)){
            System.out.println("P");
        }
    }
}
