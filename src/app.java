import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        //Initialisation de Scanner : pour lire les données saisies via la console.
        Scanner clavier = new Scanner(System.in);
        //Déclaration des variables
        int op, code, qte;
        double prix;
        String nom, nomR;
        //limiter la taille du tableau à 100
        int maxSize =100;
        //ableau pour stocker les objets de type Produit.
        Produit[] produits = new Produit[maxSize];
        /*
         * Affiche le menu
         *  saisir une option.
         * Le menu continue de s'afficher tant que l'option Pas 0
          */
      do{
          //appel a la methode printMenu pour affiche les options
          GestionStock.printMenu();
          op = clavier.nextInt();// entre un entier pour choisir une option
        switch (op) {
            case 1:
            //Ajouter un produit
                //Saisie du code, nom , qte et prix via la console
            System.out.println("Entrez le code du produit:");
             code = clavier.nextInt();
            clavier.nextLine(); // Consomme le caractère de retour à la ligne
            System.out.println("Entrez le nom du produit:");
             nom = clavier.nextLine();
              // Validation de la quantité
                do {
                    System.out.println("Entrez la quantité (doit être positive) :");
                    qte = clavier.nextInt();
                    if (qte <= 0) {
                        System.out.println("La quantité doit être un nombre positif. Réessayez.");
                    }
                } while (qte <= 0);
                // Validation du prix
                do {
                    System.out.println("Entrez le prix (doit être positif) :");
                    prix = clavier.nextDouble();
                    if (prix <= 0) {
                        System.out.println("Le prix doit être un nombre positif. Réessayez.");
                    }
                } while (prix <= 0);
            //Création d'un objet Produit avec les données saisie
            Produit produit = new Produit(code, nom, qte, prix);
            //Appel de la méthode ajouterProduit pour ajouter le produit au tableau.
            GestionStock.ajouterProduit(produits,produit);
            break;
            case 2:
                /* entre le code du produit à modifier,
                *ainsi que les nouvelles valeurs pour nom, quantité et prix.
                * */
               System.out.println("enter le code :");
                code=clavier.nextInt();
                System.out.println("enter le nom:");
                nom=clavier.next();
                // Validation de la nouvelle quantité
                do {
                    System.out.println("Entrez la nouvelle quantité (doit être positive) :");
                    qte = clavier.nextInt();
                    if (qte <= 0) {
                        System.out.println("La quantité doit être un nombre positif. Réessayez.");
                    }
                } while (qte <= 0);

                // Validation du nouveau prix
                do {
                    System.out.println("Entrez le nouveau prix (doit être positif) :");
                    prix = clavier.nextDouble();
                    if (prix <= 0) {
                        System.out.println("Le prix doit être un nombre positif. Réessayez.");
                    }
                } while (prix <= 0);
               // Appel de la méthode modifierProduit pour modifier.
                GestionStock.modifierProduit(produits,code,nom,qte,prix);
                break;

            case 3:
                //Supprimer un produit suit a un code
                System.out.println("enter le code :");
                code=clavier.nextInt();
                //Appel de la méthode supprimerProduit pour retirer le produit du tableau.
                GestionStock.supprimerProduit(produits,code);
                break;


            case 4:
                //Appel de la méthode afficherProduits pour afficher tous les produits du tableau.
                GestionStock.afficherProduits(produits);
                break;

            case 5:
                //entrer le nom d'uun produit
               System.out.println("enter le nom :");
                nomR=clavier.next();
                //Appel de la méthode rechercherProduit pour afficher les détails du produit
                GestionStock.rechercherProduit(produits,nomR);
                break;

            case 6:
                //Appel de la méthode calculerValeurStock pour calculer et afficher la valeur totale du stock.
               GestionStock.calculerValeurStock(produits);
                break;

            case 0:
                //Quitter la console
                System.out.println("Merci");
                break;

        }


    }while (op!=0);//La boucle continue de s'exécuter tant que pas de choix de l'option 0 pour quitter.
        clavier.close();
}
}