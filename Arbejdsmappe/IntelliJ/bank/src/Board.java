import java.util.ArrayList;

public class Board {
    private Field[] fields = new Field[40];

    public Board(){

    }

    public void setFields(){
        fields[0] = new Start(1,"Start", 0, 4000);

    }

}
