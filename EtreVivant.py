class EtreVivant:

    def __init__(self):
        self.point_de_vie = 100

    def se_nourrir(self):
        self.point_de_vie += 1

class Animal(EtreVivant):

    def dormir(self):
        self.point_de_vie += 1

    def se_nourrir(self):
        self.point_de_vie += 5


class Carnivore(EtreVivant):

    def chasser(self):
        self.point_de_vie -= 1

    def se_nourrir(self):
        self.point_de_vie += 10


class Chien(Animal, Carnivore):
    """Un chien qui est à la fois un animal et un carnivore"""
    

c = Chien()
# c.chasser()
# c.point_de_vie
# c.dormir()

print(c.point_de_vie)
# print(type(c).mro())
