from Professeur import *


class Agrege(Professeur):
    countAgrege = 0

    def __init__(self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant, specialiste, datePriseService, poste, rang, salaireBase, grade, status):
        Professeur.__init__(self, mat, nom, prenom, adresse, situationMatrimoniale,
                            nbEnfant, specialiste, datePriseService, poste, rang, salaireBase, grade)
        self.status = status
        self.primeSpeciale = 2*self.avantageProfesseur
        Agrege.countAgrege += 1

    def saisieAgrege(self):
        self.saisieProfesseur()
        self.grade = input("Entrer le status de L'agrege :")

    def getStatus(self):
        return self.status

    def getPrimeSpeciale(self):
        return self.primeSpeciale

    def setStatus(self, status):
        self.status = status

    def setPrimeSpeciale(self):
        self.primeSpeciale = 2*self.avantageProfesseur

    def calculSalaireNet(self):
        return Professeur.salaireNet(self)+self.primeSpeciale

    def affiche(self):
        Professeur.affiche(self)
        print("Le status est :", self.status)
        print("Le prime est :", self.primeSpeciale)

    def insererAgrege(self):
        F = open("FileAgrege.txt", 'a')
        unAgrege = self.getMat()+"\t"+self.getNom()+"\t"+self.getPrenom()+"\t"+self.getAdresse()+"\t"+self.getSituationMatrimoniale()+str(self.getNbEnfant())+"\t"+self.getSpecialiste()+"\t"+self.getDatePriseService()+"\t"+self.getPoste() + \
            "\t"+self.getRang()+"\t"+str(self.getSalaireBase())+"\t"+str(self.getRetenue())+"\t"+str(self.getPrime())+"\t" + \
            self.getGrade()+"\t"+str(self.getAvantageProfesseur())+"\t" + \
            self.getStatus()+"\t"+str(self.getPrimeSpeciale())+"\n"
        F.write(unAgrege)
        F.close()
        self.insererProfesseur()

    def affichageFichierAgrege(self):
        F = open("FileAgrege.txt", 'r')
        contenu = F.read()
        print(contenu)
        F.close()
