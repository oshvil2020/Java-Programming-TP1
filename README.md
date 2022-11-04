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

----
Demostration of program:
----

Ce programme permet de placer des paris sur des courses hippiques virtuelles.

Votre banque est vide.
Pour continuer, entrez un montant a mettre en banque (0 pour quitter) : 100

----
MENU
----
1. Placer un pari
2. Gerer la banque
3. Quitter

Entrez votre choix : 1

--------------
PLACER UN PARI
--------------

Type de pari
  1. Pari simple gagnant
  2. Pari simple place
  3. Pari couple gagnant ordonne
  4. Pari couple gagnant non ordonne
  5. Revenir au menu principal

Entrez le type de pari : 0

Erreur, entrez un choix entre 1 et 5! Recommencez...

Type de pari
  1. Pari simple gagnant
  2. Pari simple place
  3. Pari couple gagnant ordonne
  4. Pari couple gagnant non ordonne
  5. Revenir au menu principal

Entrez le type de pari : 5

----
MENU
----
1. Placer un pari
2. Gerer la banque
3. Quitter

Entrez votre choix : 1

--------------
PLACER UN PARI
--------------

Type de pari
  1. Pari simple gagnant
  2. Pari simple place
  3. Pari couple gagnant ordonne
  4. Pari couple gagnant non ordonne
  5. Revenir au menu principal

Entrez le type de pari : 1

Chevaux
  1. Gaspard
  2. Bubulle
  3. Babette
  4. Socrate
  5. Romarin
  6. Canelle

Entrez le numero du cheval : 2
Entrez le montant de la mise (0 pour annuler) : -1

Erreur, la mise doit etre entre 0.00$ et 100.00$! Recommencez...
Entrez le montant de la mise (0 pour annuler) : 100.5

Erreur, la mise doit etre entre 0.00$ et 100.00$! Recommencez...
Entrez le montant de la mise (0 pour annuler) : 25

A VOS MARQUES, PRET, PARTEZ !!!

[Deroulement de la course non montree ici, mais il le sera dans votre programme.]

CLASSEMENT A l'ARRIVEE : 
  #1 : Bubulle
  #2 : Romarin
  #3 : Canelle
  #4 : Babette
  #5 : Socrate
  #6 : Gaspard

BRAVO ! Vous avez gagné 75.00$.

GAIN CUMULE     : 50.00$
BANQUE          : 150.00$

Appuyez sur <ENTREE> pour revenir au menu principal... 

----
MENU
----
1. Placer un pari
2. Gerer la banque
3. Quitter

Entrez votre choix : 2

---------------
GERER LA BANQUE
---------------

** Montant en banque : 150.00$ **

(A)jouter, (V)ider, ou (R)evenir au menu principal : R

----
MENU
----
1. Placer un pari
2. Gerer la banque
3. Quitter

Entrez votre choix : 2

---------------
GERER LA BANQUE
---------------

** Montant en banque : 115.00$ **

(A)jouter, (V)ider, ou (R)evenir au menu principal : v

AUREVOIR!
