package Main;

import java.util.Scanner;

class DataInputOutputConsole implements DataInputOutput {
    private Scanner scanner = new Scanner(System.in);

    private String dataInput(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    @Override
    public String input() {
        return dataInput("");
    }

    @Override
    public void output(String out) {
        System.out.println("" + out);
    }
}
