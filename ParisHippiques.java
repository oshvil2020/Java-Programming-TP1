/**
 * Cette classe est une application avec menu qui permet de placer
 * des paris sur des courses hippiques virtuelles.
 *
 * Cette aplication : 
 * - place un pari entre 4 types offert.
 * - Calculer le montant gagner/pertre, montante cumulée et le montant 
 *      dans la banque.
 * - Permet de gerer la banque.
 * 
 * @author Vahid Foruzanmehr
 * @code permanant FORV26018703
 * @version automn 2022
 */


public class ParisHippiques {
      
    
       //----------------------
       // declaration des CONSTANTES
       //----------------------
    public static final String MSG_METTRE_MONTANT_BANQUE = "Pour continuer, "
        + "entrez un montant a mettre en banque (0 pour quitter) :";   
    public static final String MSG_ERR_METTRE_MONTANT_BANQUE =
        "\nErreur, le montant doit etre plus grand ou egal a 0! Recommencez...";
    public static final String LIGNE_VIDE = "\n";
    public static final String MSG_ERR_MENU = 
        "Erreur, entrez un choix entre 1 et 3! Recommencez...";
    public static final String MSG_ERR_MENU_CHEVAL = "\nErreur, entrez un choix entre 1 et 5! "
        + "Recommencez !";
    public static final String MSG_ERR_LIST_CHEVAL = 
        "\nErreur, le numero du cheval doit etre entre 1 et 6! Recommencez... \n";
    public static final String MSG_MONTANT_MISE = 
        "Entrez le montant de la mise (0 pour annuler) : ";
    public static final String MSG_ERR_MONTANT_MISE = "\nErreur, la mise doit " 
        + "etre entre 0.00$ et %.2f$ Recommencez...\n";
   
    public static final String MSG_GAGNER_CUMULE_POS = "\nBRAVO ! Vous avez gagné %.2f$.\n"
        + "\nGAIN CUMULE     : %.2f$\n" + "BANQUE          : %.2f$\n";
    public static final String MSG_GAGNER_CUMULE_NEG = "\nBRAVO ! Vous avez gagné %.2f$.\n"
        + "\nPERTE CUMULE     : %.2f$\n" + "BANQUE          : %.2f$\n";
    public static final String MSG_PERDRE_CUMULE_POS = "\nDESOLE ! Vous avez perdu votre pari.\n"
        + "\nGAIN CUMULEE   : %.2f$\n" + "BANQUE          : %.2f$ \n";
    public static final String MSG_PERDRE_CUMULE_NEG = "\nDESOLE ! Vous avez perdu votre pari.\n"
        + "\nPERTE CUMULEE   : %.2f$\n" + "BANQUE          : %.2f$ \n";
    public static final String MSG_REVENIR_MENU = 
        "Appuyez sur <ENTREE> pour revenir au menu principal...";
    public static final String MSG_FIN = "\nAUREVOIR!";
    public static final String PRESENTATION = "Ce programme permet de placer des paris"
        + " sur des courses hippiques virtuelles.";
    public static final String BANQUE_VIDE = "\nVotre banque est vide.\n";
    public static final String MENU_PRINCIPAL = "\n----\n"
        + "MENU\n"
        + "----\n"
        + "1. Placer un pari "
        + "\n2. Gerer la banque "
        + "\n3. Quitter"
        + "\n\nEntrez votre choix (1, 2 ou 3) : ";
    public static final String MENU_TITRE_PLACER_PARI = "\n--------------\n"
        + "PLACER UN PARI\n"
        + "--------------\n";
    public static final String MENU_TYPE_PARI = "\nType de pari\n"
        + "  1. Pari simple gagnant\n"
        + "  2. Pari simple place\n"
        + "  3. Pari couple gagnant ordonne\n"
        + "  4. Pari simple gagnant non ordonne\n"
        + "  5. Revenir au menu principal\n"
        + "\nEntrez le type de pari : "; 
    public static final String MSG_LIST_CHEVAL = "\nChevaux\n"
        + "  1. Gaspard\n"
        + "  2. Bubulle\n"
        + "  3. Babette\n"
        + "  4. Socrate\n"
        + "  5. Romarin\n"
        + "  6. Canelle\n";
        
    public static final String MSG_ENTRER_NUM_CHEVAL = "\nEntrez le numero du cheval : ";
    public static final String MSG_ENTRER_NUM_CHEVAL_2CHOIX = "\nEntrez le numero du %s cheval : ";
    public static final String MSG_TAP_ENTRE_MENU = 
        "\nAppuyez sur <ENTREE> pour revenir au menu principal...";
    public static final String MSG_OPERATION_ANNULEE = 
        "\n----> OPERATION ANNULEE <----\n";
    public static final String MSG_GERER_BANQUE= "\n---------------\n"
        + "GERER LA BANQUE\n"
        + "---------------";
    public static final String MSG_GERER_BANQUE_AVR=
        "\n** Montant en banque : %.2f$ **\n\n"
        + "(A)jouter, (V)ider, ou (R)evenir au menu principal : ";
    public static final String MSG_ERR_OPTION_GERER_BANQUE = "\nErreur, entrez A, V ou R! Recommencez...\n"
        + "\n** Montant en banque : %.2f$ **\n"
        + "\n(A)jouter, (V)ider, ou (R)evenir au menu principal : ";
        
    public static final String MSG_MONTANT_AJOUTER_BANQUE = "\nEntrez le montant a ajouter (0 pour annuler) : ";
    
    public static final String MSG_ERR_MONTANT_AJOUTER_BANQUE = 
        "Erreur, le montant doit etre plus grand ou egal a 0! Recommencez...";
    
    
    public static void main(String[] args) {
        
        //----------------------
        // DECLARATION VARIABLES
        //----------------------
        
        // choix de menu principal
        char choixMenu;
        // choix de menu de placer un pari avec 5 options
        char choixCheval;
        // premier et deuxiem choix pour pari couple gagnant non ordonne
        int numeroChevalPremiereChoix;
        int numeroChevalDeuxiemeChoix;
        // mettre montant de la banque dans montantBanque
        float montantBanque;
        // mettre montant pour un pari
        float montantMettre;
        // calculer le montant gain ou perte depuis qu'on commence d'ouvrir le programme
        float montantCumule;
        // c'est une flag pour quitter au boucle de menu principal de programme
        // pour calculer la resultat de gain/pertre cumulu
        float cumuleGainPerte = 0;
        float cumuleGainPerte2;
        
        boolean quitterBanque;
        // une flag pour quitter au boucle de menu type de pari de programme
        boolean quitter_MenuTypePari;
        // une flag pour quitter au boucle de menu gerer banque
        boolean quitterOptionGererBanque;
        // mettre resultat de 6chiffre dans resultatClassement
        int resultatClassement;
        // mettre premier chiffre de resultatClassement dans premierePosition comme promier place
        int premierePosition;
        // mettre deuxieme chiffre de resultatClassement dans deuxiemePosition comme deuxieme place
        int deuxiemePosition;
        // prendre une character pour option gerer banque qui contient 'a', 'A', 'r', 'R' ou 'v', 'V'.
        char optionGererBanque;
        // ajouter un montant à montant banque
        float ajouterBanque;
        int nbrErreur = 0;
        
        
        //Presentation du logiciel
        System.out.print(PRESENTATION);
        
        // flag pour organiser et sortir de boucle de menu principal
        // si c'est false, programme va sortir à boucle de menu principal
        quitterBanque = true;
        
        // validation de montant de banque audebut de programme, montant moins que 0 n'est pas acceptee
        // tant que motnant est moins que 0, il continue de prendre montantBanque
        do{
            nbrErreur ++;
            // Message erreure qui doit afficher aprés premiere erreur
            // le message ne doit pas être afficher premiere fois
            if (nbrErreur != 1){
                System.out.print(MSG_ERR_METTRE_MONTANT_BANQUE);    
            }
            
            // Afficher le montant de Banque qui est vide
            System.out.print("\n" + BANQUE_VIDE);
            
            // Demander de rentrer une nouvelle montante
            System.out.print(MSG_METTRE_MONTANT_BANQUE);
            
            // Lire le valeur et mettre en banque
            montantBanque = Clavier.lireFloat();
            
            // si le rentrée est 0, quitterBanque deviens false pour ne pas rentrer au boucle de MENU_PRINCIPAL
            if (montantBanque  == 0){
                quitterBanque = false;
            }
            
            
        }while (montantBanque < 0 );
        nbrErreur = 0;
        
        // validation de choix de menu principal
        while(quitterBanque) {
            // Afficher menu principal
            System.out.print(MENU_PRINCIPAL);
            
            //lire option choisi par operateur 
            choixMenu = Clavier.lireCharLn();
            
    
            // switch sur 3 options de menu principal : 1. Placer un pari 2. Gerer la banque 3. Quitter
            // Les seuls choix valides sont 1, 2 ou 3
            switch (choixMenu) {
                // case 1: PALACER UN PARI
                case '1':
                    System.out.print(MENU_TITRE_PLACER_PARI);
                    // Validation de choix de Cheval
                    // Les seuls choix valides sont 1, 2, 3, 4 ou 5.
                    // Le programme accepte des caractères non numériques comme a ou e3!
                    do {
                        quitter_MenuTypePari = true;
                        
                        // Afficher le menu de 4 types de pari
                        System.out.print(MENU_TYPE_PARI);
                        
                        //lire pour choisi une des 5 options
                        choixCheval = Clavier.lireCharLn();
                        
                        // Type de pari : 1. Pari simple gagnant 2. Pari simple place 
                        // 3. Pari couple gagnant ordonne 4. Pari couple gagnant non ordonne 
                        // 5. Revenir au menu principal
                        switch (choixCheval) {
                            
                            // Pari simple gagnant
                            case '1':
                                
                                // Afficher list de cheval
                                System.out.print(MSG_LIST_CHEVAL + MSG_ENTRER_NUM_CHEVAL);
                                numeroChevalPremiereChoix = Clavier.lireInt();
                                // validation de numero de chval
                                // si le choix etait plus que 6 ou moins que 1 , il doit le relire
                                while(numeroChevalPremiereChoix > 6 || numeroChevalPremiereChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL + MSG_ENTRER_NUM_CHEVAL);
                                    numeroChevalPremiereChoix = Clavier.lireInt();                                   
                                }
                                
                                
                                // Le programme demande d’entrer le montant de la mise pour le pari
                                System.out.print(MSG_MONTANT_MISE);
                                montantMettre = Clavier.lireFloat();
                                
                                // validation de montnantMettre qui doit être plus que 0 
                                // ce montant (nombre réel). Un montant valide doit être 
                                // plus grand ou égal à 0, et plus petit ou égal au montant en banque
                                while(montantMettre <0 || montantMettre > montantBanque){
                                    System.out.printf(MSG_ERR_MONTANT_MISE, montantBanque);
                                    System.out.print(MSG_MONTANT_MISE);
                                    montantMettre = Clavier.lireFloatLn();
                                    
                                                                        
                                }
                                // Si le montant valide entré est 0, le programme se termine
                                if (montantMettre == 0){
                                                                         
                                        System.out.print(MSG_OPERATION_ANNULEE + MSG_TAP_ENTRE_MENU);
                                        
                                        // attandre de taper entrée
                                        Clavier.lireFinLigne();
                                        
                                        quitter_MenuTypePari = false;
                                        break;
                                }
                                System.out.println("");
                                // effectuer et afficher la course, puis affiche et obtenir le classement
                                // effectuer et afficher la course, puis obtenir le classement
                                // La méthode executerCourse de la classe TP1Utils, retourne des classements aléatoires
                                // une variable de type int qui reçoit le résultat du classement final. Cette variable va contenir
                                // un nombre de 6 chiffres, indiquant l’ordre des numéros de chevaux à l’arrivée. 
                                // Par exemple, le nombre 316254
                                resultatClassement = TP1Utils.executerCourse();
                                // trouver la premiere position
                                premierePosition = resultatClassement / 100000;
                                // trouver la deuxieme position
                                deuxiemePosition = (resultatClassement /10000) % 10;
                                
                                //
                                // Calculer le montant gagner et effectuer sur montant banque    
                                if (premierePosition == numeroChevalPremiereChoix){
                                    // calculer montant gagner dans pari sample gagnant (qui est * 3)
                                    montantMettre = montantMettre * 3;
                                    // ajouter montant gagner à montant banque
                                    montantBanque = montantBanque + montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte + montantMettre;
                                    
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. le montant cumulé affiché est toujours positif, 
                                    // c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte >= 0){
                                        System.out.printf(MSG_GAGNER_CUMULE_POS, montantMettre, cumuleGainPerte, montantBanque);
                                    }else{
                                        
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_GAGNER_CUMULE_NEG, montantMettre, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                    
                                    // Calculer le montant perte et effectuer sur montant banque        
                                }else{
                                    montantBanque = montantBanque - montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte - montantMettre;
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte > 0){
                                        System.out.printf(MSG_PERDRE_CUMULE_POS, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_PERDRE_CUMULE_NEG, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                }
                                // S’il n’y a plus d’argent en banque, le programme signale à l’utilisateur 
                                // que sa banque est vide, et qu’il faut y déposer un montant avant de 
                                // pouvoir placer d’autres paris
                                if (montantBanque == 0){
                                    System.out.print(BANQUE_VIDE);
                                    quitterBanque = true;
        
                                    // validation de montant de banque audebut de programme
                                    do{
                                        System.out.println(MSG_ERR_METTRE_MONTANT_BANQUE);
                                        System.out.print(BANQUE_VIDE);
                                        System.out.print(MSG_METTRE_MONTANT_BANQUE);
                                        montantBanque = Clavier.lireFloat();
                                        if (montantBanque  == 0){
                                            quitterBanque =false;
                                            // break;
                                        }
                                        
                                        
                                        // validation de choix de menu
                                    }while (montantBanque < 0 );
                                }
                                quitter_MenuTypePari = false;
                                break;
                                
                            // Type 2: pari simple place
                            case '2':
                                // Afficher list de cheval
                                System.out.print(MSG_LIST_CHEVAL + MSG_ENTRER_NUM_CHEVAL);
                                numeroChevalPremiereChoix = Clavier.lireInt();
                                // validation de numero de chval
                                // le choix doit être entre 1 et 6
                                while(numeroChevalPremiereChoix > 6 || numeroChevalPremiereChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL + MSG_ENTRER_NUM_CHEVAL);
                                    numeroChevalPremiereChoix = Clavier.lireInt();                                   
                                }
                                
                                // le programme demande d'entrer le montant de la mise pour le pari
                                System.out.print(MSG_MONTANT_MISE);
                                montantMettre = Clavier.lireFloat();
                                
                                // validation de montnantMettre qui doit être plus que 0 
                                // et moins ou égale à montant banque
                                while(montantMettre <0 || montantMettre > montantBanque){
                                    System.out.printf(MSG_ERR_MONTANT_MISE, montantBanque);
                                    System.out.print(MSG_MONTANT_MISE);
                                    montantMettre = Clavier.lireFloat();
                                                                        
                                }
                                // choisir 0 pour le montant: Annulation et soritir au parie et rentrer 
                                // aux menu principal
                                if (montantMettre == 0){
                                                                         
                                        System.out.print(MSG_OPERATION_ANNULEE + MSG_TAP_ENTRE_MENU);
                                        
                                        // attandre de taper entrée
                                        Clavier.lireFinLigne();
                                        
                                        quitter_MenuTypePari = false;
                                        break;
                                }
                                System.out.println("");
                                // effectuer et afficher la course, puis obtenir le classement
                                // effectuer et afficher la course, puis obtenir le classement
                                // La méthode executerCourse de la classe TP1Utils, retourne des classements aléatoires
                                // une variable de type int qui reçoit le résultat du classement final. Cette variable va contenir
                                // un nombre de 6 chiffres, indiquant l’ordre des numéros de chevaux à l’arrivée. 
                                // Par exemple, le nombre 316254
                                resultatClassement = TP1Utils.executerCourse();
                                // trouver la premiere position
                                premierePosition = resultatClassement / 100000;
                                // trouver la deuxieme position
                                deuxiemePosition = (resultatClassement /10000) % 10;
                                
                                // Calculer le montant gagner et effectuer sur montant banque 
                                // pour gagner il faut que cheval choisi est soit la premiere position
                                // soit la deuxieme position
                                if (premierePosition == numeroChevalPremiereChoix || deuxiemePosition == numeroChevalPremiereChoix){
                                    // calculer montant gagner dans pari sample gagnant (qui est * 3)
                                    montantMettre = montantMettre * 2;
                                    // ajouter montant gagner à montant banque
                                    montantBanque = montantBanque + montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte + montantMettre;
                                    
                                    //afficher les montants avec detaills
                                    // Si l’utilisateur a gagné, le programme affiche le montant gagné 
                                    // pour cette course. Il met aussi à jour, et affiche le montant 
                                    // en banque, et le gain (ou la perte) cumulé(e)
                                    if (cumuleGainPerte >= 0){
                                        System.out.printf(MSG_GAGNER_CUMULE_POS, montantMettre, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_GAGNER_CUMULE_NEG, montantMettre, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                    
                                    // Calculer le montant perte et effectuer sur montant banque        
                                }else{
                                    montantBanque = montantBanque - montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte - montantMettre;
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte > 0){
                                        System.out.printf(MSG_PERDRE_CUMULE_POS, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_PERDRE_CUMULE_NEG, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                }
                                // S’il n’y a plus d’argent en banque, le programme signale à l’utilisateur 
                                // que sa banque est vide, et qu’il faut y déposer un montant avant de 
                                // pouvoir placer d’autres paris
                                if (montantBanque == 0){
                                    System.out.print(BANQUE_VIDE);
                                    quitterBanque = true;
        
                                    // validation de montant de banque audebut de programme
                                    do{
                                        System.out.println(MSG_ERR_METTRE_MONTANT_BANQUE);
                                        System.out.print(BANQUE_VIDE);
                                        System.out.print(MSG_METTRE_MONTANT_BANQUE);
                                        montantBanque = Clavier.lireFloat();
                                        if (montantBanque  == 0){
                                            quitterBanque =false;
                                            // break;
                                        }
                                        
                                        
                                        // validation de choix de menu
                                    }while (montantBanque < 0 );
                                }
                                quitter_MenuTypePari = false;    
                                

                                break;
                                
                                
                            // Type 3: Pari couple gagnant ordonne  
                            case '3':
                                // Afficher list de cheval et demander le numero de premiere choix
                                System.out.print(MSG_LIST_CHEVAL);
                                System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "premier");
                                numeroChevalPremiereChoix = Clavier.lireInt();
                                
                                // validation de numero de chval pour premiere choix
                                // si le choix etait plus que 6 ou moins que 1 , il doit le relire
                                while(numeroChevalPremiereChoix > 6 || numeroChevalPremiereChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL);
                                    System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "premier");
                                    numeroChevalPremiereChoix = Clavier.lireInt();
                                    
                                    
                                }
                                // Afficher list de cheval et demander le numero de deuxieme choix
                                System.out.print(MSG_LIST_CHEVAL);  
                                System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "deuxieme");
                                numeroChevalDeuxiemeChoix = Clavier.lireInt();
                                // validation de numero de chval pour deuxieme choix
                                // si le choix etait plus que 6 ou moins que 1 , il doit le relire
                                while(numeroChevalDeuxiemeChoix > 6 || numeroChevalDeuxiemeChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL);
                                    System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "deuxieme");
                                    numeroChevalDeuxiemeChoix = Clavier.lireInt();
                                    
                                    
                                }
                                
                                System.out.print(MSG_MONTANT_MISE);
                                montantMettre = Clavier.lireFloat();
                                // validation de montnantMettre qui doit être plus que 0 et 
                                // moins ou égale à montant banque
                                while(montantMettre <0 || montantMettre > montantBanque){
                                    System.out.printf(MSG_ERR_MONTANT_MISE, montantBanque);
                                    System.out.print(MSG_MONTANT_MISE);
                                    montantMettre = Clavier.lireFloat();
                                                                        
                                }
                                // Annulation et soritir au parie et rentrer aux menu principal 
                                // en choisissant 0
                                if (montantMettre == 0){
                                                                         
                                        System.out.print(MSG_TAP_ENTRE_MENU);
                                        // attandre de taper entrée
                                        Clavier.lireFinLigne();
                                        quitter_MenuTypePari = false;
                                        break;
                                }
                                
                                System.out.println("");
                                // effectuer et afficher la course, puis obtenir le classement
                                // effectuer et afficher la course, puis obtenir le classement
                                // La méthode executerCourse de la classe TP1Utils, retourne des classements aléatoires
                                // une variable de type int qui reçoit le résultat du classement final. Cette variable va contenir
                                // un nombre de 6 chiffres, indiquant l’ordre des numéros de chevaux à l’arrivée. 
                                // Par exemple, le nombre 316254
                                resultatClassement = TP1Utils.executerCourse();
                                // trouver la premiere position
                                premierePosition = resultatClassement / 100000;
                                deuxiemePosition = (resultatClassement /10000) % 10;
                                
                                // Calculer le montant gagner et effectuer sur montant banque
                                // pour gagner il faut bien choisir premier position et deuxieme position
                                // le montant gagné équivaut à 3.5 fois la mise
                                if (premierePosition == numeroChevalPremiereChoix && deuxiemePosition == numeroChevalDeuxiemeChoix ){
                                    // calculer montant gagner dans pari sample gagnant (qui est * 3)
                                    montantMettre = montantMettre * 3.5f;
                                    // ajouter montant gagner à montant banque
                                    montantBanque = montantBanque + montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte + montantMettre;
                                    
                                    //afficher les montants avec detaills
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte >= 0){
                                        System.out.printf(MSG_GAGNER_CUMULE_POS, montantMettre, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_GAGNER_CUMULE_NEG, montantMettre, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                    
                                    // Calculer le montant perte et effectuer sur montant banque        
                                }else{
                                    montantBanque = montantBanque - montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte - montantMettre;
                                    
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte > 0){
                                        System.out.printf(MSG_PERDRE_CUMULE_POS, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_PERDRE_CUMULE_NEG, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                }
                                // S’il n’y a plus d’argent en banque, le programme signale à l’utilisateur 
                                // que sa banque est vide, et qu’il faut y déposer un montant avant de 
                                // pouvoir placer d’autres paris
                                if (montantBanque == 0){
                                    System.out.println(BANQUE_VIDE);
                                    quitterBanque = true;
        
                                    // validation de montant de rentrer qui dois être plus que 0
                                    // et si c'est égale à 0, sortir le programme et aller au menu principale
                                    do{
                                        System.out.println(MSG_ERR_METTRE_MONTANT_BANQUE);
                                        System.out.print(BANQUE_VIDE);
                                        System.out.print(MSG_METTRE_MONTANT_BANQUE);
                                        montantBanque = Clavier.lireFloat();
                                        if (montantBanque  == 0){
                                            quitterBanque =false;
                                            // break;
                                        }
                                        
                                        
                                        // validation de choix de menu
                                    }while (montantBanque < 0 );
                                }
                                quitter_MenuTypePari = false;
                                break;
                            
                            // Type 4 : pari couple gagnant non ordonne 
                            // le montant gagné équivaut à 2.5 fois la mise
                             // demande à l’utilisateur d’entrer le numéro du premier deuxième cheval 
                             // choisi (nombre entier)
                            case '4': 
                                // Afficher list de cheval et demander numéro de premier cheval
                                System.out.print(MSG_LIST_CHEVAL);
                                System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "premier");
                                numeroChevalPremiereChoix = Clavier.lireInt();
                                
                                // validation de numero de chval pour premiere choix
                                // si le choix etait plus que 6 ou moins que 1 , il doit le relire
                                while(numeroChevalPremiereChoix > 6 || numeroChevalPremiereChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL);
                                    System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "premier");
                                    numeroChevalPremiereChoix = Clavier.lireInt();
                                    
                                }
                                // Afficher list de cheval et demander numéro de deuxiem cheval
                                System.out.print(MSG_LIST_CHEVAL);
                                System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "deuxieme");
                                numeroChevalDeuxiemeChoix = Clavier.lireInt();
                                
                                // validation de numero de chval pour deuxieme choix
                                // si le choix etait plus que 6 ou moins que 1 , il doit le relire
                                while(numeroChevalDeuxiemeChoix > 6 || numeroChevalDeuxiemeChoix < 1){
                                    System.out.print(MSG_ERR_LIST_CHEVAL + MSG_LIST_CHEVAL);
                                    System.out.printf(MSG_ENTRER_NUM_CHEVAL_2CHOIX , "deuxieme");
                                    numeroChevalDeuxiemeChoix = Clavier.lireInt();
                                    
                                }
                                
                                System.out.print(MSG_MONTANT_MISE);
                                montantMettre = Clavier.lireFloat();
                                // validation de montnantMettre qui doit être plus que 0 
                                // et moins ou égale à montant banque
                                while(montantMettre <0 || montantMettre > montantBanque){
                                    System.out.printf(MSG_ERR_MONTANT_MISE, montantBanque);
                                    System.out.print(MSG_MONTANT_MISE);
                                    montantMettre = Clavier.lireFloat();
                                                                        
                                }
                                // Annulation et soritir au parie et rentrer aux menu principal en choisissant 0
                                if (montantMettre == 0){                               
                                        System.out.print(MSG_TAP_ENTRE_MENU);
                                        // attandre de taper entrée
                                        Clavier.lireFinLigne();
                                        quitter_MenuTypePari = false;
                                        break;
                                }
                                System.out.println("");
                                // effectuer et afficher la course, puis obtenir le classement
                                // La méthode executerCourse de la classe TP1Utils, retourne des classements aléatoires
                                // une variable de type int qui reçoit le résultat du classement final. Cette variable va contenir
                                // un nombre de 6 chiffres, indiquant l’ordre des numéros de chevaux à l’arrivée. 
                                // Par exemple, le nombre 316254
                                resultatClassement = TP1Utils.executerCourse();
                                                                
                                // trouver la premiere position
                                premierePosition = resultatClassement / 100000;
                                deuxiemePosition = (resultatClassement /10000) % 10;
                                
                                // Calculer le montant gagner et effectuer sur montant banque
                                if ((premierePosition == numeroChevalPremiereChoix && deuxiemePosition == numeroChevalDeuxiemeChoix) 
                                    || (deuxiemePosition == numeroChevalPremiereChoix && premierePosition == numeroChevalDeuxiemeChoix) ){
                                    // calculer montant gagner dans pari sample gagnant (qui est * 2.5)
                                    montantMettre = montantMettre * 2.5f;
                                    // ajouter montant gagner à montant banque
                                    montantBanque = montantBanque + montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte + montantMettre;
                                    
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte >= 0){
                                        System.out.printf(MSG_GAGNER_CUMULE_POS, montantMettre, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_GAGNER_CUMULE_NEG, montantMettre, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                    
                                    // Calculer le montant perte et effectuer sur montant banque        
                                }else{
                                    montantBanque = montantBanque - montantMettre;
                                    // calculer montant cumuler
                                    cumuleGainPerte = cumuleGainPerte - montantMettre;
                                    
                                    // Si le montant cumulé est strictement négatif, on parle de perte cumulée, sinon,
                                    // on parle de gain cumulé. 
                                    // le montant cumulé affiché est toujours positif, c’est le mot gain ou perte qui change
                                    if (cumuleGainPerte > 0){
                                        System.out.printf(MSG_PERDRE_CUMULE_POS, cumuleGainPerte, montantBanque);
                                    }else{
                                        cumuleGainPerte2 = cumuleGainPerte * (-1);
                                        System.out.printf(MSG_PERDRE_CUMULE_NEG, cumuleGainPerte2, montantBanque);
                                    }
                                    
                                    System.out.print(MSG_TAP_ENTRE_MENU);
                                    // attand taper entrée
                                    Clavier.lireFinLigne();
                                }
                                // S’il n’y a plus d’argent en banque, le programme signale à l’utilisateur 
                                // que sa banque est vide, et qu’il faut y déposer un montant avant de 
                                // pouvoir placer d’autres paris
                                if (montantBanque == 0){
                                    System.out.println(BANQUE_VIDE);
                                    quitterBanque = true;
        
                                    // validation de montant de banque audebut de programme
                                    do{
                                        System.out.println(MSG_ERR_METTRE_MONTANT_BANQUE);
                                        System.out.print(BANQUE_VIDE);
                                        System.out.print(MSG_METTRE_MONTANT_BANQUE);
                                        montantBanque = Clavier.lireFloat();
                                        if (montantBanque  == 0){
                                            quitterBanque =false;
                                            // break;
                                        }
                                        
                                        
                                        // validation de choix de menu
                                    }while (montantBanque < 0 );
                                }
                                quitter_MenuTypePari = false;
                                break;
                            
                            // Revenir au menu principal
                            case '5':
                                quitter_MenuTypePari = false;
                                break;
                                                            
                            default:
                                // correction
                                System.out.println(MSG_ERR_MENU_CHEVAL);
                        }
                        
                        
                    }while (quitter_MenuTypePari );
                    
                    break;
                    
                // OPTION 2 : GÉRER LA BANQUE
                case '2':
                    System.out.print (MSG_GERER_BANQUE);
                    
                    // flage pour sorti la boucle d'option gerer banque et revenir au menu 
                    // (a)jouter un montant, (v)ider la banque, ou (r)evenir au menu principal
                    
                    quitterOptionGererBanque = true;
                    // Le programme valide le choix de l’utilisateur. Un choix valide 
                    // est 'a' ou 'A' pour ajouter un montant à la banque, 
                    // 'v' ou 'V' pour vider la banque ou bien 'r' ou 'R' pour 
                    // revenir au menu principal
                    do{
                        System.out.printf (MSG_GERER_BANQUE_AVR, montantBanque);
                        optionGererBanque = Clavier.lireCharLn();
                        // optionGererBanque = optionGererBanque.toLowerCase();
                        
                        while (!(optionGererBanque == 'a' || optionGererBanque == 'v' 
                        ||optionGererBanque == 'r' || optionGererBanque == 'A' 
                        || optionGererBanque =='V' ||optionGererBanque == 'R')){
                               
                            System.out.printf(MSG_ERR_OPTION_GERER_BANQUE, montantBanque);
                            optionGererBanque = Clavier.lireCharLn();
                            
                        }  
                        
                        // Le programme valide le choix de l’utilisateur. Un choix valide 
                        // est 'a' ou 'A' pour ajouter un montant à la banque, 
                        // 'v' ou 'V' pour vider la banque ou bien 'r' ou 'R' pour 
                        // revenir au menu principal
                        switch (optionGererBanque){
                            
                            // ajouter à banque
                            case 'a' : case 'A' :
                                nbrErreur =0;
                                
                                // validation de montant
                                // Un montant valide doit être plus grand ou égal à 0. 
                                // Si le montant entré est 0, le programme affiche de nouveau 
                                // le montant dans la banque puis redemande à l’utilisateur 
                                // s’il veut ajouter un montant, vider la banque, ou revenir 
                                // au menu principal.
                                do{
                                    nbrErreur ++ ;
                                    // pour premiere fois, il affiche le message pour ajouter le montant
                                    // et apres premiere fois, si l'utilisateur ne rentrer pas bien,
                                    // il affiche une message d'erreure avant.
                                    if (nbrErreur == 1){
                                        System.out.print(MSG_MONTANT_AJOUTER_BANQUE );    
                                    }else{
                                        System.out.print("\n" + MSG_ERR_MONTANT_AJOUTER_BANQUE);
                                        System.out.print(MSG_MONTANT_AJOUTER_BANQUE);
                                    }
                                    
                                    ajouterBanque = Clavier.lireFloat();
                                    
                                    
                                    if (ajouterBanque  == 0){
                                        // flage pour sorti la boucle de menu principale
                                        quitterBanque =false;
                                        
                                    }
                                    
                                    
                                }while (ajouterBanque < 0 );
                                
                                montantBanque = montantBanque + ajouterBanque;
                                break;
                            
                            // vider la banque et terminer
                            // Lorsque l’utilisateur choisit de vider la banque, le programme se termine
                            case 'v' : case 'V' :
                                // vider le montant banque
                                montantBanque = 0;
                                // flage pour sorti la boucle d'option gerer banque
                                quitterOptionGererBanque = false;
                                // flage pour sorti la boucle de menu principale
                                quitterBanque = false;
                                break;
                                                       
                                                            
                            // revenir au menu proncipal
                            // le programme affiche le menu principal, en attente du prochain 
                            // choix de l’utilisateur
                            case 'r': case 'R':
                                // flage pour sorti la boucle d'option gerer banque
                                quitterOptionGererBanque = false;
                                break;
                                
                                                        
                        }
                    }while (quitterOptionGererBanque);
                    
                    
                    break;
                    
                // OPTION 3 : QUITTER LE PROGRAMME
                // le programme affiche un message de fin et se termine
                case '3':
                    quitterBanque = false;
                    break;

                
                default:
                    System.out.println("\n" + MSG_ERR_MENU);
            }
    
        } 
        
        // message de fin
        System.out.println(MSG_FIN);
    }
}