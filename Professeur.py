from Medecin import *


class Professeur(Medecin):
    countProfesseur = 0

    def __init__(self, mat, nom, prenom, adresse, situationMatrimoniale, nbEnfant, specialiste, datePriseService, poste, rang, salaireBase, grade):
        Medecin.__init__(self, mat, nom, prenom, adresse, situationMatrimoniale,
                        nbEnfant, specialiste, datePriseService, poste, rang, salaireBase)
        self.grade = grade
        self.avantageProfesseur = salaireBase/4
        Professeur.countProfesseur += 1

    def saisieProfesseur(self):
        self.saisieMedecin()
        self.grade = input("Entrer la grade du professeur :")

    def getGrade(self):
        return self.grade

    def getAvantageProfesseur(self):
        return self.avantageProfesseur

    def setGrade(self, grade):
        self.grade = grade

    def setAvantageProfesseur(self, avantageProfesseur):
        self.avantageProfesseur = (1/4)*self.avantageProfesseur

    def calculSalaireNet(self):
        return Medecin.calculSalaireNet(self)+self.avantageProfesseur

    def affiche(self):
        Medecin.affiche()
        print("La grade est :", self.grade)
        print("L'avantage professeur est de :", self.avantageProfesseur)

    def insererProfesseur(self):
        F = open("FileProfesseur.txt", 'a')
        unPorfesseur = self.getMat()+"\t"+self.getNom()+"\t"+self.getPrenom()+"\t"+self.getAdresse()+"\t"+self.getSituationMatrimoniale()+str(self.getNbEnfant())+"\t"+self.getSpecialiste()+"\t"+self.getDatePriseService() + \
            "\t"+self.getPoste()+"\t"+self.getRang()+"\t"+str(self.getSalaireBase())+"\t"+str(self.getRetenue()) + \
            "\t"+str(self.getPrime())+"\t"+self.getGrade() + \
            "\t"+str(self.getAvantageProfesseur())+"\n"
        F.write(unPorfesseur)
        F.close()
        self.insererMedecin()

    def affichageFichierProfesseur(self):
        F = open("FileProfesseur.txt", 'r')
        contenu = F.read()
        print(contenu)
        F.close()
