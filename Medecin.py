from PersonnelSoignant import *


class Medecin(PersonnelSoignant):
    countMedecin = 0

    def __init__(self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant, specialiste, datePriseService, poste, rang, salaireBase):
        PersonnelSoignant.__init__(
            self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant)
        self.specialiste = specialiste
        self.datePriseService = datePriseService
        self.poste = poste
        self.rang = rang
        self.salaireBase = salaireBase
        self.prime = nbEnfant*(salaireBase/10)
        self.retenue = self.prime/3
        Medecin.countMedecin += 1

    def saisieMedecin(self):
        self.saisiePersonnel()
        self.specialiste = input("Entrer la specialiste du medecin")
        self.datePriseService = input(
            "Entrer la date du prise de service du medecin ")
        self.poste = input("Entrer le poste du medecin ")
        self.rang = input("Entrer le rang du medecin ")
        self.salaireBase = int(input("Entrer le salaireBase du medecin "))

    def calculSalaireNet(self):
        return self.salaireBase+self.prime-self.retenue

    def affiche(self):
        PersonnelSoignant.affichePersonnel(self)
        print("La specialiste est :", self.specialiste)
        print("La date de prise de service est :", self.datePriseService)
        print("Le poste est :", self.poste)
        print("Le rang est :", self.rang)
        print("Le salaireBase est :", self.salaireBase)
        print("La retenue est :", self.retenue)
        print("La prime est :", self.prime)

    def setSpecialiste(self, specialiste):
        self.specialiste = specialiste

    def getSpecialiste(self):
        return self.specialiste

    def setDatePriseServices(self, datePriseService):
        self.datePriseService = datePriseService

    def getDatePriseServices(self):
        return self.datePriseService

    def setPoste(self, poste):
        self.poste = poste

    def getPoste(self):
        return self.poste

    def setRang(self, rang):
        self.rang = rang

    def getRang(self):
        return self.rang

    def setSalaireBase(self, salaireBase):
        self.salaireBase = salaireBase

    def getSalaireBase(self):
        return self.salaireBase

    def setRetenue(self):
        self.retenue = self.prime/3

    def setPrime(self):
        self.prime = self.nbEnfant*(salaireBase/10)

    def insererMedecin(self):
        F = open("DossierMedecinSoignant.txt", 'a')
        unMedecin = self.getMat()+"\t"+self.getNom()+"\t"
        +self.getPrenom()+"\t"+self.getAdresse()
        +"\t"+self.getSituationMatrimoniale()+str(self.getNbEnfant())
        +"\t"+self.getSpecialiste()+"\t"+self.getDatePriseService()
        +"\t"+self.getPoste()+"\t"+self.getPoste()+"\t"+self.getRang()
        +"\t"+str(self.getSalaireBase())+"\t"+str(self.getRetenue())
        +"\t"+str(self.getPrime())+"\n"
        F.write(unMedecin)
        F.close()
        self.insererPersonnelSoignant()

    def affichageFichierMedecin(self):
        F = open("DossierMedecinSoignant.txt", 'r')
        contenu = F.read()
        print(contenu)
        F.close()
