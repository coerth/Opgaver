public class Player {
    private String name;
    private BankAccount account;
    private int id;
    private int position;

    private static int counter;


    public Player(String name, int balance) {
        this.account = new BankAccount(name,balance);
        counter++;
        this.id = counter;
        this.name = name;

    }

    public int updatePosition(int diceRoll){

        position += diceRoll;
        return position;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        String s;
        s = name + ":" + account.getBalance() + "\n";
        return s;
    }
}
