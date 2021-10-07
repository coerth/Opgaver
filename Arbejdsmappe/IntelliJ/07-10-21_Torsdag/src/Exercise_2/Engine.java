package Exercise_2;

public class Engine {
    private int horsePower;
    private int cylinders;
    private boolean fuelInjection;
    private String gasolinType;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }


}
