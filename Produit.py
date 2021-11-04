class Produit():
    cptProduit = 0

    def __init__(self):
        self.code = ""
        self.nom = ""
        self.prix = 0
        self.qte = 0
        self.dateFabrication = ""
        self.fournisseur = ""
        Produit.cptProduit += 1

    def setCode(self, code):
        self.code = code

    def getCode(self):
        return self.code

    def setNom(self, nom):
        self.nom = nom

    def getNom(self):
        return self.nom

    def setPrix(self, prix):
        self.prix = prix

    def getPrix(self):
        return self.prix

    def setQte(self, qte):
        self.qte = qte

    def getQte(self):
        return self.qte

    def setDateFabrication(self, dateFabrication):
        self.dateFabrication = dateFabrication

    def getDateFabrication(self):
        return self.dateFabrication

    def setFournisseur(self, fournisseur):
        self.fournisseur = fournisseur

    def getFournisseur(self):
        return self.fournisseur
    def saisieProduit(self):
        self.code=input("Entrer le code du produit")
        self.nom=input("Entrer le nom du produit")
        self.prix=int(input("Entrer le prix du produit"))
        self.qte=float(input("Entrer le quantite du produit"))
        self.dateFabrication=input("Entrer la date de fabrication du  produit")
        self.fournisseur=input("Entrer le fournisseur du produit")
    
    def afficheProduit(self):
        print("Le code est ",self.code)
        print("Le nom du produit est ",self.nom)
        print("Le prix unitaire  du produit est ",self.prix)
        print("La quantite du produit est ",self.qte)
        print("La date de fabrication est ",self.dateFabrication)
        print("Le fournisseur du produit est ",self.fournisseur)