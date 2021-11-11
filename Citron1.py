class Citron1:
    saveur = "acide"  # attribut de classe

    def __init__(self, couleur="jaune"):
        self.couleur = couleur  # attribut d'instance

    def affiche_attributs(self):
        print(f"attribut de classe: {self.saveur}")
        print(f"attribut d'instance: {self.couleur}")


if __name__ == "__main__":
    citron1 = Citron1()
    citron1.affiche_attributs()

animaux = ["girafe", "tigre", "singe", "souris"]
for i in animaux:
    print(i)
i = 0
while i < 10:
    reponse = input("Entrer un entier superieur a 10 :")
    i = int(reponse)
