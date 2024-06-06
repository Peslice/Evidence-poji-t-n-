import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// Třída pro interakci s menu
public class Menu {
    public static void VolbaMenu(){
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        String volba = "";
        // cyklus - hlavní menu
        while (!volba.equals("4")) {
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        volba = scanner.nextLine();
        System.out.println();
        // reakce na volbu
        switch (volba) {
            case "1":
                DatabazePojistencu.pridejPojisteneho();
                break;
            case "2":
                DatabazePojistencu.vypisPojisteneOsoby();
                break;
            case "3":
                DatabazePojistencu.vyhledejPojisteneho();
                break;
            case "4":
                break;
            default:
                System.out.println("Neplatná volba.");
                break;
             }
         }
    }
}
