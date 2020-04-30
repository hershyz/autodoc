import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Config config = new Config();
        Scanner scn = new Scanner(System.in);
        String[] commands;
        String[] definitions;

        System.out.print("number of terms: ");
        int terms = Integer.valueOf(scn.nextLine());
        commands = new String[terms];
        definitions = new String[terms];

        for (int i = 0; i < terms; i++) {
            System.out.print("command:     ");
            String currentCommand = scn.nextLine().trim();
            System.out.print("definition:  ");
            String currentDefinition = scn.nextLine().trim();
            commands[i] = currentCommand;
            definitions[i] = currentDefinition;
        }

        int maxFound = 0;
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].length() > maxFound) {
                maxFound = commands[i].length();
            }
        }

        System.out.println("");
        System.out.println("<" + config.tag + ">");

        int target = maxFound + config.minSpaceCount;
        for (int i = 0; i < commands.length; i++) {

            String currentCommand = commands[i];
            int currentSpaceLength = target - currentCommand.length();
            String spaces = getSpaceWithLength(currentSpaceLength);

            if (config.italics) {
                System.out.print("<i>");
            }
            if (config.bold) {
                System.out.print("<strong>");
            }

            System.out.print(commands[i] + config.suffix);

            if (config.italics) {
                System.out.print("</i>");
            }
            if (config.bold) {
                System.out.print("</strong>");
            }

            System.out.println(spaces + definitions[i]);
        }

        System.out.println("</" + config.tag + ">");
    }

    public static String getSpaceWithLength(int x) {

        String spaces = "";
        for (int i = 0; i < x; i++) {
            spaces = spaces + " ";
        }

        return spaces;
    }
}