package butik;

public class Main {

    public static void main(String[] args) {
        Butik butik = new Butik();
        int i = butik.køb(244, 500);

        System.out.println(i);

       String s = butik.byttePenge(i);
        System.out.println(s);
    }



}
