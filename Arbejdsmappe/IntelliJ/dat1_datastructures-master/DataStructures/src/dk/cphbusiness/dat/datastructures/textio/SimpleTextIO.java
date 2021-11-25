package dk.cphbusiness.dat.datastructures.textio;

import java.util.Scanner;

public class SimpleTextIO implements TextIO{

    private Scanner scanner;

    public SimpleTextIO() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void output(String text) {
        System.out.print(text);
    }

    @Override
    public String input() {

        return scanner.nextLine();
    }
}
