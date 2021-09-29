class Rocket:
    def __init__(self, name, distance):
        self.name = name
        self.distance = distance

    def lancer(self):
        return "%s est rechercher %s" % (self.name, self.distance)


class MarsRover(Rocket):  # inheriting from the base class
    def __init__(self, name, distance, maker):
        Rocket.__init__(self, name, distance)
        self.maker = maker

    def get_marque(self):
        return "%s Lancer par %s" % (self.name, self.maker)


if __name__ == "__main__":
    x = Rocket("Alfa diallo", "bailobaya dari")
    y = MarsRover("massoud", "Mars", "ISRO")
    print(x.lancer())
    print(y.lancer())
    print(y.get_marque())
