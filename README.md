# Java-Programming-TP1

- TP1Utils.java : classe à importer dans votre projet pour pouvoir utiliser la méthode executerCourse.
NE PAS MODIFIER cette classe.


Notions mises en pratique : le respect d’un ensemble de spécifications, les instructions Java, les conventions de
style Java, et les bonnes pratiques de programmation.

1. Spécifications

Il s’agit de concevoir une petite application permettant de placer des paris sur des courses hippiques virtuelles. Votre
programme doit être implémenté dans une seule classe nommée ParisHippiques qui ne doit contenir qu’une seule
méthode, la méthode main.


Pour calculer le montant gagné (s’il y a lieu) : lorsque l’utilisateur perd son pari, il n’obtient aucun gain. Lorsque
l’utilisateur gagne son pari, le montant gagné est calculé selon le type du pari effectué :

- Pour un pari simple gagnant : le montant gagné équivaut à 3 fois la mise.
- Pour un pari simple placé : le montant gagné équivaut à 2 fois la mise.
- Pour un pari couplé gagnant ordonné : le montant gagné équivaut à 3.5 fois la mise.
- Pour un pari couplé gagnant non ordonné : le montant gagné équivaut à 2.5 fois la mise.
