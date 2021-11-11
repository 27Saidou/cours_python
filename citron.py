class Citron:
    def __init__(self, masse, couleur="jaune"):
        self.masse = masse
        self.couleur = couleur
        self.affiche_message()

    def affiche_attributs(self, var=2):
        print(self)
        print(self.couleur)
        print(var)

    def affiche_message(self):
        print("Le Citron est trop bon !")


if __name__ == "__main__":
    citron1 = Citron(100)
    print("citron1:", citron1.__dict__)
    citron2 = Citron(150, couleur="blanc")
    print("citron2:", citron2.__dict__)
    citron1.affiche_attributs()
    citron1.affiche_message()
