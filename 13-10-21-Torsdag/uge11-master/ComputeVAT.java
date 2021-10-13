/*
 * FORMÅL:
 * At omskrive en procesorienteret løsning til en objektorienteret løsning
 *
 * OPGAVE:
 * Du skal forbedre denne kode ved at flytte de forskellige metoder
 * ud i klasser
 *
 * Fremgangsmåden er flg:
 * 1) Kør koden så du forstår hvad den gør
*  2) kopier eksisterende kode
 * 2) gem hver metode i en klasse med passende navne
   doDiag i en klasse der hedder 'Dialog'
   doVat i en klasse der hedder 'CalculateVat'
   doView i en klasse der hdder 'View'
   runController i en klasse der hedder Controller
 * 3) sørg for passende "inventar" (fields, constructor og metoder)

 * 4) sørg for at lave en Main som kun rummer flg:
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runController();
    }
    *
    * TEST kørsel:
    * Indtast varens pris:
345,6
Du betaler 86,40 Kr i MOMS

*  5) Dokumenter programmet med et klassediagram - brug PlantUML
 *
 */


import java.util.Scanner;
public class ComputeVAT {
  final static int PRCVAT = 25;
  final static String MSG = "MOMS";
  final static String CURRENCY = "Kr";

  public static void main(String[] args){
    runController();
  }
  public static void runController() {
    double userIn = doDiag();
    double moms = doVAT(userIn);
    doView(moms,MSG);
  }

  public static double doVAT(double number){
    double VAT = number / 100 * PRCVAT; 
    return VAT;
  }
  public static double doDiag(){
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast varens pris: ");
    double number = myScan.nextDouble();
    return number;
  }
  public static void doView(double result, String typeOfResult){
    System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
  }
}