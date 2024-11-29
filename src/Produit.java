public class Produit {

    private int code;
    private String nom;
    private int quantity;
    private double prix;

    public Produit(int code, String nom, int quantity, double prix) {
        this.code = code;
        this.nom = nom;
        this.quantity = quantity;
        this.prix = prix;
    }

    public Produit() {
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrix() {
        return prix;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double calculerValeur() {
        return quantity * prix;
    }

    @Override
    public String toString() {
        return "Produit [Code: " + code + ", Nom: " + nom + ", Quantité: " + quantity + ", Prix: " + prix+"]";
}

}
