public class GestionStock {
    //Methode pour afficher le Menu
    static void printMenu(){
        System.out.println("------Gestion de Stock------");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Afficher la liste des produits");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Calculer la valeur totale du stock");
        System.out.println("0. Quitter");
        System.out.println("Choisissez une option :");
    }

    //Afficher le liste des produits
    static void afficherProduits(Produit[] produits){
        boolean hasProducts = false; //suivre si un produit a été trouver dans le tableau
        //parcourir le tableau
        for (Produit produit : produits) {
            if (produit != null) {
                hasProducts = true;// produit est trouvé
                break; //
            }
        }
        // Si aucun produit n'a été trouvé, afficher un message
        if (!hasProducts) {
            System.out.println("Pas de produit, merci d'ajouter des nouveaux produits.");
            return; // Sortir une fois rien à afficher
        }
        //parcourir le tableau et afficher les produits
        for (Produit produit : produits) {
                if(produit !=null) {
                    System.out.println(produit.toString());

                }
        }
    }

        // Ajouter un produit
    public static void ajouterProduit(Produit[] produits, Produit produit) {
        boolean added = false;
        for (Produit p : produits) {
            // Verifier si le code est unique
            if (p != null && p.getCode() == produit.getCode()) {
                System.out.println("Le code du produit existe déjà. Impossible d'ajouter ce produit.");
                return; // quitter si le code n'est pas unique
            }
        }
        //parcourir le tabelau une fois le slot est null on ajouteun produit
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null) {
                produits[i] = produit;  // ajouter le produit dans le produit dand le premier slot disponible
                System.out.println("Produit ajouté avec succès !");
                added = true;
                break;  // quitter une fois le produit est ajouté
            }
        }
        // si le tableau est plein affiche message
        if (!added) {
            System.out.println("Impossible d'ajouter un produit : la liste est pleine.");
        }
    }

    //Modifier un Produit suit a un code
    static void modifierProduit(Produit[] produits,int code, String nouveauNom, int nouvelleQuantite, double nouveauPrix){
        //Parcourir le tableau afin de trouver le produit suite au code donné
        for (Produit p : produits) {
            if (p.getCode() == code) {
                //modifier le produit avec setters, vu que code, nom, quantity et prix sont privés
                p.setCode(code);
                p.setNom(nouveauNom);
                p.setQuantity(nouvelleQuantite);
                p.setPrix(nouveauPrix);
                System.out.println("Update is done");
                break;// une fois done, on sort de la boucle
            } else {
                System.out.println("New value should not be null");
            }
            //La methode String pour afficher les details d'un prduits
            System.out.println(p.toString());
        }

    }

    //Chercher un produit avec le nom
    static void rechercherProduit(Produit[] produits,String nom){
        //parcourir le tableau afin de trouver le produit selon le nom donné
        for (Produit produit : produits) {
            /* verfier si le nom du produit est egal et nom entré
             * vu que nom est privé in pass par getNom()
             * equals fin de verifier le les deux valeurs de nom*/
            if (produit.getNom().equals(nom)) {
                System.out.println(produit.toString());// ToString pour afficher le detail du produit
                break;//sortir
            } else {
                System.out.println("produit introuvable !");

            }

        }
    }

    //Suuprimer un produit selon un code donné
    static void supprimerProduit(Produit[] produits,int code) {
        int currentIndex=produits.length;
        //Prcourir le tableau pourtrouver le prdouit à supprimer
        for (int i = 0; i < currentIndex; i++) {
            // verifie si l'élément du tableau à i n'est pas null
            //Verfie si le code du produit correspond au code recherché
            if (produits[i] != null && produits[i].getCode() == code ) {
                // Décaler tous les produits suivants d'une case vers la gauche
                for (int j = i; j < currentIndex - 1; j++) {
                    produits[j]= produits[j + 1];// Remplacer le produit actuel par le suivant
                }
                produits[currentIndex - 1]=null;// mettre le dernier élément du tableau à null

                System.out.println("Produit supprimé avec succès!");
                break;//sortir de la boucle une fois que le produit est supprimé
            }
        }
    }

    //Calculer le stock
    static void calculerValeurStock(Produit[] produits){
        //Initialisé la valeur stock a 0
        double stock = 0;
        //Parcourir le tabelau pour recupuer les valeurs du stok et prix
        for (Produit produit : produits) {
            if(produit !=null){
                //Calculer la valeur du stock utilisant la methode CalculerValuer
                stock += produit.calculerValeur();
            }
        }
                System.out.println("Le stock est " +stock);//Afficher le total du stock
        }

}

