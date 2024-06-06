
// Třída reprezentující uživatele
public class PojistenaOsoba {
    /**
     * Jméno
     */
   private String jmeno;
    /**
     * Příjmení
     */
   private String prijmeni;
    /**
     * Věk
     */
    private int let;
    /**
     * Telefoní číslo
     */
    private  String telefoniCislo;
    /**
     * Inicializuje novou instanci
     */
    public PojistenaOsoba(String jmeno, String prijmeni, int let, String telefoniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.let = let;
        this.telefoniCislo = telefoniCislo;
    }

    /**
     * Vrátí textovou reprezentaci pojištěné osoby
     *
     * @return Textová reprezentace pojištěné osoby
     */
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + let + " " + telefoniCislo;
    }

    public String getjmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
}
