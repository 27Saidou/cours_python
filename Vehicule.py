class Vehicule:
    
    def __init__(self,marque=None,vitesse_initiale=0):
        self.marque =marque
        self.__vitesse=vitesse_initiale
        
    @property
    def vitesse(self):
        return self.__vitesse
    
    def accelerer(self,delta_vitesse): 
        self.__vitesse +=delta_vitesse 
        
    def decelerer(self,delta_vitesse): 
        self.__vitesse -=delta_vitesse   
        

class Voiture(Vehicule):
    def __init__(self, marque=None, vitesse_initiale=0, klaxon="tût tût !"):
        super().__init__(marque,vitesse_initiale)
        self.klaxon= klaxon
        
    def klaxonner(self):
        print(self.klaxon)    

v=Voiture("Toyota",88.0)
print(v.marque)
v.klaxonner()
print(v._Vehicule__vitesse)
    
