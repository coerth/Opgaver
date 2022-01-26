public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        //controller.addLootTableToList(new LootTable("Test"));

        /*controller.getLootTable("Test").insertTableEntry("Det er nr 1");
        controller.getLootTable("Test").insertTableEntry("Det er nr 2");
        controller.getLootTable("Test").insertTableEntry("Det er nr 3");
        controller.getLootTable("Test").insertTableEntry("Det er nr 4");
        controller.getLootTable("Test").insertTableEntry("Det er nr 5");*/


        /*for(String s : lootTable.getTableEntries().values())
        {
            System.out.println(s);
        }*/

        /*while(true)
        {
            System.out.println(controller.getLootTable("25 gp Art Objects").rollOnTable());
        }*/

        controller.startOptions();

        //System.out.println(controller.getList().size());

    }
}
