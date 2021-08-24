class Etre_Vivant:

    def __init__(self, point_de_vie):
        self.point_de_vie = point_de_vie

    def se_nourrir(self):
        self.point_de_vie += 1

class Animal(Etre_Vivant):

    def __init__(self, nom, point_de_vie):
        super().__init__(point_de_vie)
        self.nom = nom

    def dormir(self):
        self.point_de_vie += 1

    def se_nourrir(self):
        self.point_de_vie += 5


class Carnivore(Etre_Vivant):

    def chasser(self):
        self.point_de_vie -= 1

    def se_nourrir(self):
        self.point_de_vie += 10


class Chien(Carnivore, Animal):
    """Un chien qui est à la fois un animal et un carnivore"""

    def __init__(self, point_de_vie, nom):
        super().__init__(point_de_vie, nom)


c = Chien("Medor", 60)
print(c.nom)
print(c.point_de_vie)
c.se_nourrir()
print(c.point_de_vie)

