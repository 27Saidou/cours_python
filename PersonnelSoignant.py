class PersonnelSoignant:
    countPers=0
    def __init__(self,mat,nom,prenom,adresse,situationMatrimoniale,nbEnfant):
        self.mat=mat
        self.nom=nom
        self.prenom=prenom
        self.adresse=adresse
        self.situationMatrimoniale=situationMatrimoniale
        self.nbEnfant=nbEnfant
        PersonnelSoignant.countPers +=1
    
    def saisiePersonnel(self):
        self.mat=input("Entrer le numero de matricule du personnel:")
        self.nom=input("Entrer le nom de la personnel:")
        self.prenom=input("Entrer le prenom : ")
        self.adresse= input("Entrer l'Adresse du personnel :")
        self.situationMatrimoniale=input("Entrer la situationMatrimoniale du personnel :")
        self.nbEnfant=int(input("Entrer le nombre d'enfant :"))
    
    def affichePersonnel(self):
        print("le matricule est :",self.mat)
        print("Le nom est :",self.nom)
        print("Le prenom est :",self.prenom)
        print("L'adresse :",self.adresse)
        print("Le nombre d'enfant est :",self.nbEnfant)
        print("La situationMatrimoniale est :",self.situationMatrimoniale)

    def setMat(self,mat):
        self.mat=mat

    def getMat(self):
        return self.mat

    def setNom(self,nom):
        self.nom=nom

    def getNom(self):
        return self.nom

    def setPrenom(self,prenom):
        self.prenom=prenom

    def getPrenom(self):
        return self.prenom
    def setAdress(self,adresse):
        self.adresse=adresse

    def getAdresse(self):
        return self.adresse

    def setSituationMatrimoniale(self,situationMatrimoniale):
        self.situationMatrimoniale=situationMatrimoniale

    def getSituationMatrimoniale(self):
        return self.situationMatrimoniale

    def setNbEnfant(self,nbEnfant):
        self.nbEnfant=nbEnfant

    def insererPersonnelSoignant(self):
        F = open("DossierPersonnelSoignant.txt", "a")

        persSoignant = self.getMat()+"\t"+self.getNom()+"\t"
        +self.getPrenom()+"\t"+self.getAdresse()+"\t" + \
            self.getSituationMatrimoniale()+str(self.getNbEnfant())+"\n"
        F.write(persSoignant)
        F.close()

    def affichageFichierPersonnel(self):
        F=open("DossierPersonnelSoignant.txt",'r')
        contenu=F.read()
        print(contenu)
        F.close()
    
