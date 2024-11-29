public class Produit {
        //Declaration des varialbles
    private int code;
    private String nom;
    private int quantity;
    private double prix;

    //constructeur avec paramettre
    public Produit(int code, String nom, int quantity, double prix) {
        this.code = code;
        this.nom = nom;
        this.quantity = quantity;
        this.prix = prix;
    }
    //constructeur sans paramettre
    public Produit() {
    }
    //Declaartion des getters afin d'acceder les attributs
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

    //Declaartion des getters afin de modiffier les attributs

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

    //surcharger la methode String afin d'afficher le detail d'un produit
    @Override
    public String toString() {
        return             "Code: " + getCode() +
                "\t Nom: " + getNom() +
                "\t Quantité: " + getQuantity() +
                "\t Prix: " + getPrix();
}

}
