class Employee:

    def __init__(self,nom):
         self.nom=nom
        


    def presentation(self):
         print("je suis dev front{}".format(self.nom))





class Patron(Employee):
    def __init__(self,voiture,nom): 
       Employee.__init__(self,nom)
       self.voiture=voiture

    def se_deplacer(self):
        print( self.voiture,"le patron a une voiture")


p =Patron("peugeot","sy")
p.presentation()
p.se_deplacer()
# emp=Employee("diallo")
# emp.presentation()    
     


