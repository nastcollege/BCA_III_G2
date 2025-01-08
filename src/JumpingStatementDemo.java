public class JumpingStatementDemo {

    public static void main(String[] args) {
        //break
        for (int i = 1; i < 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }

        //continue
        for (int i = 1; i < 100; i++) {
            if (i == 50) {
                continue;
            }
            System.out.println(i);
        }

        //return
        int result = getNumber();
        System.out.println(result);

    }

    public static int getNumber(){
        return 1;
    }


}
