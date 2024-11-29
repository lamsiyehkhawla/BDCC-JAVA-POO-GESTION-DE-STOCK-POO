public class GestionStock {
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

    static void afficherProduits(Produit[] produits){
        boolean hasProducts = false;
        for (Produit produit : produits) {
            if (produit != null) {
                hasProducts = true;
                break; // Exit the loop as soon as we find a non-null product
            }
        }

        if (!hasProducts) {
            System.out.println("Pas de produit, merci d'ajouter des nouveaux produits.");
            return; // Exit the function since there’s nothing to display
        }

        for (Produit produit : produits) {
                if(produit !=null) {
                    System.out.println("Code: " + produit.getCode() +
                            "\t Nom: " + produit.getNom() +
                            "\t Quantité: " + produit.getQuantity() +
                            "\t Prix: " + produit.getPrix());
                }
        }
    }

    public static void ajouterProduit(Produit[] produits, Produit produit) {
        boolean added = false;

        // Look for the first available (null) slot in the array
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null) {
                produits[i] = produit;  // Add the new product to the first available slot
                System.out.println("Produit ajouté avec succès !");
                added = true;
                break;  // Exit once the product is added
            }
        }

        if (!added) {
            System.out.println("Impossible d'ajouter un produit : la liste est pleine.");
        }
    }
    }

