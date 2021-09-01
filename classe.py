class Voiture:

    voiture_crees=0
    def __init__(self,marque):
        self.marque= marque
        voiture_crees+=1

    def afficher_marque(self,vitesse):
        print(f" La voiture est une {self.marque}")


voiture_O1=Voiture("Lamborghini") 
voiture_O2=Voiture("Porsche")
Voiture.afficher_marque(voiture_O1,50) 
print(voiture_O1.marque)
print(voiture_O2.marque)
print(Voiture.voiture_crees)