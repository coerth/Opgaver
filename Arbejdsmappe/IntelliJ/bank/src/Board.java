import java.util.ArrayList;

public class Board {
    private Field[] fields = new Field[40];

    public Board(){
        setFields();
    }

    private void setFields(){
        //todo: læse field data ind og instantiere felter af forskellig type
        fields[0] = new Start(1,"Start", 0, 4000);
    }
    public Field getField(int playerPosition){
        return fields[playerPosition-1];
    }

}
