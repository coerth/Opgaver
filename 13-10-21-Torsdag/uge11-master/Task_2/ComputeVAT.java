package Task_2;/*
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
  final protected int PRCVAT = 25;
  final protected String MSG = "MOMS";
  final protected String CURRENCY = "Kr";

//  public int getPRCVAT() {
//    return PRCVAT;
//  }
//
//  public String getMSG() {
//    return MSG;
//  }
//
//  public String getCURRENCY() {
//    return CURRENCY;
//  }
}





