#class Animal
class Animaux():
    
    # methode permet de tester le polymorphisme
    def crier(self):
        print("un cri d'animal")
        
#class Chien    
class Chien(Animaux):
    
    # methode crier(Example Polymorphisme)
    def crier(self):
        print("whouaf whouaf")
        
    def crier_comme_un_animal(self):
        super().crier()    
        
# class Chat 
class Chat(Animaux):
    #methode crier(Example Polymorphisme)
    def crier(self):
        print("miaou")

        
animal=Animaux()        
chien=Chien()
chien.crier_comme_un_animal()
chien.crier()
animal=Chat()
animal.crier()
