class Personne():
    def __init__(self,nom,prenom):
        self._nom = nom
        self._prenom = prenom

class Etudiant(Personne):
    def __init__(self,nom,prenom,code):
        super().__init__(nom,prenom)
        self._code=code 

class Employee():
    def __init__(self,nom,salaire):
        self.nom = nom
        self.__salaire = salaire

    def getSalaire(self):
        return self.__salaire

class Cadre(Employee):
    def __init__(self,nom,salaire,prime):
        super().__init__(nom,salaire)
        self.__prime=prime

c=Cadre("Alfa diallo",1000000,2500)
print(c.getSalaire())
e=Employee("saidou",2500)
print(e._Employee__salaire)
e=Etudiant("Diallo","Alpha",12)
print(e._nom)
print(e._code)
print(isinstance(e,Etudiant))