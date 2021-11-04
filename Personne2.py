class Personne2():
    nbPers = 0

    def __init__(self):
        self.nom = ""
        self.prenom =""
        self.sexe = ""
        self.age = 0
        self.adresse = ""
        Personne2.nbPers += 1

    def setNom(self, nom):
        self.nom = nom

    def getNom(self):
        return self.nom

    def setPrenom(self, prenom):
        self.prenom = prenom

    def getPrenom(self):
        return self.prenom

    def setSexe(self, sexe):
        self.sexe = sexe

    def getSexe(self):
        return self.sexe

    def setAge(self, age):
        self.age = age

    def getAge(self):
        return self.age

    def setAdresse(self, adresse):
        self.adresse = adresse

    def getAdresse(self):
        return self.adresse

    def saisiePersonne(self):
        self.nom = input("Entrer le nom de la personne")
        self.prenom = input("Entrer le prenom de la personne")
        self.sexe = input("Entrer le sexe de la personne M/F :")
        self.age = int(input("Entrer l'age de la personne  :"))
        self.adresse = input("Entrer le adresse de la personne :")

    def affichePersonne(self):
        print("Le nom de la personne est :", self.nom)
        print("Le prenom de la personne est :", self.prenom)
        print("Le sexe de la personne est :", self.sexe)
        print("L'age de la personne est :", self.age)
        print("L' Adresse de la personne est:", self.adresse)



