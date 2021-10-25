public class Property extends Field{
    protected int seriesID;
    private Deed deed;
    private String currentOption;

    public Property(int id, String label, int cost, int income, int seriesID) {
        super(id, label, cost, income);
        this.seriesID = seriesID;
    }

    @Override
    public String onLand(){
        String s = super.onLand();
        if(deed.isOwned()){

            //todo: tjek efter monopol
            if(deed.getOwner() == Main.getCurrentPlayer()){
                s += "\n"+"vil du udbygge?";
                currentOption = "Build";
            }

            else{
                s += "\n"+"Du skylder penge";
                //todo sæt timer så ejeren skal huske at kigge
                currentOption = "Pay";
            }
        }
        else {
            s += "\n"+"Vil du købe denne grunde, den koster en pepsi laks";
            currentOption = "Buy";
        }
        return s;
    }

    @Override
    public void onAccept(){
        if(currentOption.equals("Buy")){
            //Todo: træk penge fra spillerens konto og giv til banken
            //sætte this.owner til currentPlayer
            System.out.println("Du er nu ejer af " + label);
        }
    }

    @Override
    public void onReject(){
    }

    @Override
    public String toString() {
        String s = super.toString();
        s+=  " En del af serie: "+ seriesID;
        return s;
    }

}