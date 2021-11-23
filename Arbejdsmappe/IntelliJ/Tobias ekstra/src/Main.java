public class Main {

    public static void main(String[] args) {
        Pair<String> p = new PairImpl<>("Første", "Sidste");

        System.out.println(p.getFirst());
        System.out.println(p.getLast());
    }
}
