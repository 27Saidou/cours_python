class Humain():
    def __new__(cls,nom,prenom):
        print("creation objet")
        return super().__new__(cls)

    def __init__(self,nom,prenom):
        print("Initialisation")
        self._nom = nom
        self._prenom = prenom  

    def __str__(self):
        return "Nom= {}:prenom={}".format(self._nom, self._prenom)

etre_humain=Humain("diallo","rama")
print(etre_humain)       