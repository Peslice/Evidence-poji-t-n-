

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;

// Třída pro funkce hlavního menu
public class DatabazePojistencu {
    static Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    //Vytvoření ArrayListu pro ukládání dat o pojištěných osobách
    static ArrayList<PojistenaOsoba>seznamPojistenych = new ArrayList<>();
    

    // Metoda pro přidání nové pojištěné osoby
    public static void pridejPojisteneho() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine().trim().toLowerCase();
        while (jmeno.length() < 3) {
            System.out.println(("Zadejte prosím jméno s minimálně 3 znaky!"));
            jmeno = scanner.nextLine().trim();
        }

        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine().trim().toLowerCase();
        while (prijmeni.length() < 3) {
            System.out.println(("Zadejte prosím příjmení s minimálně 3 znaky!"));
            prijmeni = scanner.nextLine().trim();
        }

        int let = -1;
        while (true) {
            System.out.println("Zadejte svůj věk:");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println(("Věk nesmí být prázdný! Zkuste to znovu. "));
                continue;
            }

            try {
                let = Integer.parseInt(input);
                if (let < 1 || let > 120) {
                    System.out.println("Zadaný věk je mimo rozsah. Zkuste to znovu.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Zadaný věk není platné číslo. Zkuste to znovu.");
            }
        }

        System.out.println("Zadejte telefoní číslo bez předvolby:");
        String telefoniCislo = scanner.nextLine().trim();
        while(telefoniCislo.length() !=9){
            System.out.println("Zadejte prosím telefoní číslo o 9 číslicích!");
            telefoniCislo = scanner.nextLine().trim();
        }

        PojistenaOsoba novaPojistenaOsoba = new PojistenaOsoba(jmeno, prijmeni, let, telefoniCislo);
        seznamPojistenych.add(novaPojistenaOsoba);

        System.out.println("Data byla uložena.");
    }


    //Metoda pro výpis všech pojištěných osob
    public static void vypisPojisteneOsoby(){
        // Výpis všech prvků ArrayListu pomocí cyklu for
        System.out.println("------------------------");
        System.out.println("Seznam pojištěných osob");
        System.out.println("------------------------");
        for (PojistenaOsoba pojistenaOsoba : seznamPojistenych){
            System.out.println(pojistenaOsoba.toString()); // volání metody toString() ze třídy PojistenaOsoba
        }
    }


    // Metoda pro vyhledání pojištěné osoby podle příjmení
    public static void vyhledejPojisteneho() {
        ArrayList<String> vyhledaneOsoby = new ArrayList<>();

        System.out.println("Zadejte příjmení hledané osoby:");
        String hledanePrijmeni = scanner.nextLine().trim();

        for (PojistenaOsoba hledanaOsoba : seznamPojistenych){
            if (hledanaOsoba.getPrijmeni().startsWith(hledanePrijmeni)){
                vyhledaneOsoby.add(String.valueOf(hledanaOsoba));
            }
        }
        if (vyhledaneOsoby.isEmpty()){
            System.out.println("Nebyly nalezeny žádné shody.");
        } else {
            System.out.println("Vyhledané osoby:");
            for (String hledanaOsoba : vyhledaneOsoby) {
                System.out.println(hledanaOsoba);
            }
        }
    }
}

