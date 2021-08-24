from abc import ABCMeta,abstractmethod

class Animal2(metaclass=ABCMeta):
    
    @abstractmethod
    def crier(self):
        pass

class Chien(Animal2):

    def crier(self):
        print("whouaf whouaf !")
    
chien =Chien()
chien.crier()
print(isinstance(chien,Chien))  
