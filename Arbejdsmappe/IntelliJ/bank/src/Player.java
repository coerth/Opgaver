public class Player {
    private int id;
    private static int counter = 0;


    public Player(String name, float balance) {
        BankAccount account = new BankAccount(name,balance);
        counter++;
        this.id = counter;

    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                '}';
    }
}
