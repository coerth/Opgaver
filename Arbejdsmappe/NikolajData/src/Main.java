import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        String[] navne = {"Michael", "Nicolai", "Kristoffer","Morten","Casper","Mia"};

/*

        Set<String> stringTreeSet = new TreeSet<>(Arrays.asList(navne));
        Set<String> stringLinkedHashSet = new LinkedHashSet<>(Arrays.asList(navne));
        Set<String> stringHashSet = new HashSet<>(Arrays.asList(navne));

        stringTreeSet.add("Long");
        stringTreeSet.add("Long");
        stringLinkedHashSet.add("Long");
        stringLinkedHashSet.add("Long");

        for (String s : stringHashSet)
        {
            System.out.println(s);
        }*/

        /*Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("michael", 42);
        treeMap.put("nicolai",45);
        treeMap.put("kristoffer", 41);
        treeMap.put("morten", 43);
        treeMap.put("casper", 43);
        treeMap.put("mia", 39);*/

        //System.out.println(treeMap.get("morten"));

        //indsæt(treeMap);

        /*while (true) {

          Integer svar =  getInt("Tryk 1 for at slå navn op  \nTryk 2 for at indsætte nyt navn ");

          switch (svar)
          {

            case 1:
               System.out.println(treeMap.getOrDefault(getString("angiv navn"), -1));
               break;

              case 2:
                  indsæt(treeMap);
                  break;

              default:
                  System.out.println("det input forstod jeg ikke");
          }*/



/*        List<String> stringsList = new ArrayList<>(Arrays.asList(navne));

        Collections.sort(stringsList);

        for (String s : stringsList)
        {
            System.out.println(s);
        }*/


        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Michael", 42));
        personList.add(new Person("Nicolai", 45));
        personList.add(new Person("Muneeb", 43));
        personList.add(new Person("Kristoffer", 41));
        personList.add(new Person("Morten", 43));


        personList.sort((o1, o2) -> o1.getSkoStørrelse() - o2.getSkoStørrelse());

        for (Person person : personList)
        {
            System.out.println(person);
        }

    }

        //System.out.println(getInt("skriv et tal"));








    /*public static void indsæt(Map map)
    {
        map.put(getString("angiv navnet til den nye nøgle"), getInt("indtast et tal til den nye nøgle"));
    }

    public static Integer getInt(String s)
    {
        Integer i;

        while (true)
        {

            try {
                i = Integer.parseInt(getString(s));
                return i;
            } catch (NumberFormatException e) {
                System.out.println("husk det skal være i tal");
            }

        }

    }

    public static String getString(String s)
    {
        System.out.println(s + " : ");

        Scanner scan = new Scanner(System.in);

        return scan.nextLine().toLowerCase(Locale.ROOT);
    }*/
}
