class Personne():
    
    def __init__(self,nom,prenom,profession):
        self.nom=nom
        self.prenom=prenom
        self.profession=profession

       

class Etudiant(Personne):
    def __init__(self,code,nom,prenom,profession):
        super().__init__(nom,prenom,profession) 
        self.code=code


f=Etudiant(101,"Diallo","Alpha","developpeur mobile")
print(f.nom)
print(f.prenom)
print(f.profession)
print(f.code) 