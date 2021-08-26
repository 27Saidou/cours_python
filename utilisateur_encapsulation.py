class Utilisateur_Encapsulation():
    # L'encapsulation est le processus consistant à conserver les données et le code (méthodes)
    # qui manipulent ces données ensemble en tant qu'unité
    def __init__(self,prenom,nom,age,profession):
        self.prenom = prenom
        self.nom = nom
        self.age = age
        #membre private in python(encapsulation en python example)
        self.__profession = profession
        
    def afficher_to_encapsulation(self):
        print(f"Prenom={self.prenom}")
        print(f"Nom={self.nom}")
        print(f"Age={self.age}")
        print(f"Profession={self.__profession}")
        
        
alphonse=Utilisateur_Encapsulation("Alpha","Diallo",27,"Engineer java")
alphonse.afficher_to_encapsulation()
print(alphonse._Utilisateur_Encapsulation__profession)
# print(isinstance(alphonse,Utilisateur_Encapsulation))     
