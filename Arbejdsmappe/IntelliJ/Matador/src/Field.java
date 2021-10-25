   abstract public class Field {
        int cost;
        int income;
        String label;
        int id;

        public Field(int id, String label, int cost, int income){
            this.cost = cost;
            this.label = label;
            this.income = income;
            this.id = id;
        }

        //Vil du købe grunden eller du er landet på x
        public String onLand(){
        String message = "Du er landet på " + label;
            return message;
        }

        //Er der blevet sagt ja eller nej
        public void processResponse(String response){

            if(response.equalsIgnoreCase("Y")){
                this.onAccept();
            }
            else{
                this.onReject();
            }
        }



       abstract void onAccept();

       abstract void onReject();


        @Override
        public String toString(){

            return id+": "+label;
        }
    }

