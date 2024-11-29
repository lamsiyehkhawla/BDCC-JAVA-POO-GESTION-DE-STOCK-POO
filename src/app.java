import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int op, code, qte;
        double prix;
        String nom, nomR;
        int maxSize =100;
        Produit[] produits = new Produit[maxSize];

      do{
          GestionStock.printMenu();
          op = clavier.nextInt();
        switch (op) {
            case 1:
            //Ajouter un produit
            // Input product details
            System.out.println("Entrez le code du produit:");
             code = clavier.nextInt();
            clavier.nextLine(); // Consume the newline
            System.out.println("Entrez le nom du produit:");
             nom = clavier.nextLine();
            System.out.println("Entrez la quantité:");
            qte = clavier.nextInt();
            System.out.println("Entrez le prix:");
            prix = clavier.nextDouble();
            Produit produit = new Produit(code, nom, qte, prix);

            GestionStock.ajouterProduit(produits,produit);
            break;
            case 2:
               System.out.println("enter le code :");
                code=clavier.nextInt();
                System.out.println("enter le nom:");
                nom=clavier.next();
                System.out.println("enter la quantité :");
                qte=clavier.nextInt();
                System.out.println("enter le prix:");
                prix=clavier.nextDouble();
                GestionStock.modifierProduit(produits,code,nom,qte,prix);
                break;

            case 3:
                System.out.println("enter le code :");
                code=clavier.nextInt();
                GestionStock.supprimerProduit(produits,code);
                break;
                //afficher
            case 4:
                GestionStock.afficherProduits(produits);
                break;

            case 5:
               System.out.println("enter le nom :");
                nomR=clavier.next();
                GestionStock.rechercherProduit(produits,nomR);
                break;

            case 6:
               GestionStock.calculerValeurStock(produits);
                break;

            case 0:
                System.out.println("Merci");
                break;

        }


    }while (op!=0);

}
}