Projet : Application de Gestion de Stock (Programmation Orientée Objet)
Contexte :
Vous êtes chargé de développer une version améliorée de l&#39;application de gestion de stock
pour une petite boutique. Cette version doit intégrer les concepts de programmation
orientée objet pour structurer et simplifier le code tout en améliorant la maintenabilité et la
lisibilité. Les données doivent être représentées sous forme d&#39;objets, et l&#39;application doit
utiliser des tableaux d&#39;objets pour gérer les produits.
Objectifs de l&#39;application :
• Ajouter un produit : Créer un nouvel objet Produit et l&#39;ajouter au tableau de produits.
• Modifier un produit : Mettre à jour les informations d&#39;un produit existant en utilisant son
code unique.
• Supprimer un produit : Supprimer un produit du tableau en utilisant son code unique.
• Afficher la liste des produits : Afficher la liste des produits en stock avec leurs détails.
• Rechercher un produit : Trouver un produit par son nom.
• Calculer la valeur totale du stock : Calculer la valeur totale des produits en stock.
Spécifications Techniques :
1. Création d&#39;une classe Produit :
• Attributs privés :
- int code : Code unique du produit.
- String nom : Nom du produit.
- int quantite : Quantité en stock.
- double prix : Prix unitaire du produit.
• Constructeurs :
- Un constructeur avec tous les attributs.
- Un constructeur par défaut.
• Méthodes :
- Des getters et setters pour accéder et modifier les attributs.
- Une méthode toString() pour afficher les détails d&#39;un produit.
- Une méthode pour calculer la valeur totale d&#39;un produit en stock (quantite * prix).
2. Tableau d&#39;objets Produit :
• Utiliser un tableau de type Produit[] pour gérer les produits (limité à 100 produits
maximum).

3. Classe principale GestionStock :
• Cette classe contient le menu principal et les méthodes statiques suivantes :
- printMenu() : Afficher le menu principal.
- ajouterProduit(Produit produit) : Ajouter un nouvel objet Produit au tableau.
- modifierProduit(int code, String nouveauNom, int nouvelleQuantite, double nouveauPrix)
: Modifier un produit existant.
- supprimerProduit(int code) : Supprimer un produit du tableau en utilisant son code.
- afficherProduits() : Afficher la liste complète des produits en parcourant le tableau.
- rechercherProduit(String nom) : Rechercher un produit par son nom et afficher ses
informations.
- calculerValeurStock() : Parcourir le tableau pour calculer la valeur totale du stock.
4. Utilisation de la console :
• L&#39;application doit être interactive avec un menu pour naviguer entre les fonctionnalités.
• Les informations nécessaires (code, nom, quantité, prix) doivent être saisies par
l&#39;utilisateur via la console.
Exemple d&#39;interface console :

Contraintes supplémentaires :
• Les codes produits doivent être uniques. Vérifiez l&#39;unicité avant d&#39;ajouter un produit.
• Gérez les cas où le tableau est plein (affichez un message d&#39;erreur si l&#39;utilisateur tente
d&#39;ajouter un produit alors que la capacité maximale est atteinte).
• Ajoutez des validations de base pour éviter les entrées invalides (par exemple, les prix et
les quantités doivent être positifs).
Livrables :
• Code source complet avec commentaires.

• Explication des choix d&#39;implémentation (par exemple, pourquoi utiliser des
getters/setters, intérêt de la méthode toString, etc.).
• Une démonstration de l&#39;application avec différents scénarios de test.
