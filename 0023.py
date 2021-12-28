class Personne():
    def __init__(self, prenom, nom, age):
        self.__prenom = prenom
        self.__nom = nom
        self.__age = age

    def est_majeur(self):
        if self.__age >= 18:
            return True
        return False

    def vieillir(self):
        self.__age += 1

    def __str__(self):
        resulat = self.__prenom + " " + \
            self.__nom + " a " + str(self.__age)+ " ans "
        if self.est_majeur():
            resulat += "Il/Elle est majeur(e)."
        else:
            resulat += "Il/Elle est mineur(e)."
        return resulat


if __name__ == "__main__":
    alpha = Personne(prenom="alpha", nom="Diallo", age=17)
    print(alpha)
    alpha.vieillir()
    print(alpha)
