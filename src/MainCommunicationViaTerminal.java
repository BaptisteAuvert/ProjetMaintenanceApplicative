import formes.Carre;
import formes.Point;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private DrawCanvas dc;

    private static String[] CommandMessages = {
            "exit",
            "clear",
            "plot"
    };

    public static void main(String[] args) {
        DrawCanvas dc = new DrawCanvas(300,300);
        String lineRead = "";
        while (lineRead != "exit") {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez une commande : ");
            lineRead = scanner.next();
            String[] tokens = lineRead.split(" ");
            if (tokens.length > 0) {
                String cmdName = tokens[0];
                switch (cmdName) {
                    case "exit":
                        System.out.println("-------Au revoir-------- ");
                    case "clear":
                        // Action pour la commande "clear"
                        break;
                    case "plot":
                        // Action pour la commande "plot"
                        break;
                    case "help":
                        System.out.println("Les commandes disponibles sont :\n ");
                        for (int i = 0; i < CommandMessages.length; i++) {
                            System.out.println(CommandMessages[i]);
                        }

                    case "carre":
                        if (tokens.length > 5 ){
                            dc.adShape( new Carre(Integer.valueOf(tokens[1]),Integer.valueOf(tokens[2]),Integer.valueOf(tokens[3]), Color.getColor(tokens[4])));
                        }

                    case "cercle":

                    case "triangle":

                    case "ligne":

                    default:
                        System.out.println("------Commande Inconnue------");
                }
            }
        }
    }
}
