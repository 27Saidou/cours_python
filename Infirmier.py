from PersonnelSoignant import *


class Infirmier(PersonnelSoignant):
    countInfirmier = 0

    def __init__(self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant, niveau, forfait, salaireBase):
        PersonnelSoignant.__init__(
            self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant)
        self.niveau = niveau
        self.forfait = forfait
        self.avantage = (1/5)*self.niveau
        self.salaireBase = salaireBase
        Infirmier.countInfirmier += 1

    def saisieInfirmier(self):
        self.saisiePersonnel()
        self.niveau = input("Entrer le niveau ")
        self.forfait = input("Entrer le forfait   :")
        self.salaireBase = int(input("Entrer le salaire de base du medecin :"))

    def affiche(self):
        PersonnelSoignant.affiche(self)
        print("Le niveau est de :", self.niveau)
        print("Le forfait est de :", self.forfait)
        print("Le salaire de :", self.salaireBase)

    def getNiveau(self):
        return self.niveau

    def getForfait(self):
        return self.forfait

    def getAvantage(self):
        return self.avantage

    def getSalaireBase(self):
        return self.salaireBase

    def setNiveau(self, niveau):
        self.niveau = niveau

    def setForfait(self, forfait):
        self.forfait = forfait

    def setSalaireBase(self, salaireBase):
        self.salaireBase = salaireBase

    def setAvantage(self):
        self.avantage = (1/5)*self.forfait

    def calculSalaireNet(self):
        return self.salaireBase+self.avantage

    def insererInfirmier(self):
        F = open("FileInfirmier.txt", 'a')
        unInfirmier = self.getMat()+"\t"+self.getNom()+"\t"
        +self.getPrenom()+"\t"+self.getAdresse()
        +"\t"+self.getSituationMatrimoniale()+str(self.getNbEnfant())+"\t"+self.getNiveau()+"\t" + \
            str(self.getForfait())+"\t"+str(self.getAvantage()) + \
            "\t"+str(self.getSalaireBase())+"\n"
        F.write(unInfirmier)
        F.close()
        self.insererPersonnelSoignant()

    def affichageFichierInfirmier(self):
        F = open("FileInfirmier.txt", 'r')
        contenu = F.read()
        print(contenu)
        F.close()
