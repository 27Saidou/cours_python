class Animal:
    def __init__(self,nom):
        self.nom=nom
        

    #cette methode permet de faire du café
    def make_coffee(self): 
       print(self.nom,"make me coffee Ok") 




class Reptile(Animal):
    def __init__(self,nom,regime_alimentaire):
        #super().__init__()
        Animal.__init__(self,nom)
        self.regime= regime_alimentaire

    #cette methode permet de manger
    def manger(self):
        print("le reptile mange....")    

#instanciation de la class Chien
chien =Reptile("Serpent","grenouille")
chien.make_coffee()
