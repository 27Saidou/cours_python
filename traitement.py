from PersonnelSoignant import *
from Medecin import *
from Infirmier import *
from Professeur import *
from Agrege import *


def menu(self):
    while (1):
        print("\n\n\t\t\t 1 - Creer un personnel Soignant ")
        print("\n\n\t\t\t 2 - Creer un infirmier ")
        print("\n\n\t\t\t 3 - Creer un Medecin ")
        print("\n\n\t\t\t 4 - Creer un Professeur ")
        print("\n\n\t\t\t 5 - Creer Agrege ")
        print("\n\n\t\t\t 6 - Afficher le personnel soignant ")
        print("\n\n\t\t\t 7 - Afficher les Infirmiers ")
        print("\n\n\t\t\t 8 - Afficher les medecins ")
        print("\n\n\t\t\t 9 - Afficher les Professeurs ")
        print("\n\n\t\t\t 10 - Afficher les agreges ")
        print("\n\n\t\t\t 0 - Quitter ")
        print("\n\n\t\t\t faites votre choix  ")
        choix = int(input(""))
        if (choix == 1):
            p = PersonnelSoignant("", "", "", "", "", 0)
            p.saisiePersonnel()
            p.insererPersonnelSoignant()
        else:
            if (choix == 2):
                p = Infirmier("", "", "", "", "", 0, "", 0, 0)
                p.saisieInfirmier()
                p.insererInfirmier()
            else:
                if(choix == 3):
                    p = Medecin("", "", "", "", "", 0, "", "", "", "", 0)
                    p.saisieMedecin()
                    p.insererMedecin()
                else:
                    if (choix == 4):
                        p = Professeur("", "", "", "", "", 0,
                                        "", "", "", "", 0, "")
                        p.saisieProfesseur()
                        p.insererProfesseur()
                    else:
                        if (choix == 5):
                            p = Agrege("", "", "", "", "", 0,
                                            "", "", "", "", 0, "", "")
                            p.saisieAgrege()
                            p.insererAgrege()
                        else:
                            if (choix == 6):
                                self.affichageFichierPersonnel()
                            else:
                                if (choix == 7):
                                    self.affichageFichierInfirmier()
                                else:
                                    if (choix == 8):
                                        self.affichageFichierMedecin()
                                    else:
                                        if(choix == 9):
                                            self.affichageFichierProfesseur()
                                        else:
                                            if(choix == 10):
                                                self.affichageFichierAgrege()
                                            else:
                                                if(choix == 0):
                                                    print("Au revoir et a la prochaine\n")
                                                    return 0
                                                else:
                                                    print("choix Indisponible ou inexistant ")
