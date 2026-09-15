import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlipCase {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try {
            Scanner sc = new Scanner(file);
            String result = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (Character.isUpperCase(ch))
                        result += Character.toLowerCase(ch);
                    else if (Character.isLowerCase(ch))
                        result += Character.toUpperCase(ch);
                    else
                        result += ch;

                    result += "\n";
                }
            }

            sc.close();

            PrintWriter pw = new PrintWriter(file);
            pw.print(result);
            pw.close();

            System.out.println("Case changed successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}