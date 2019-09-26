# parent class
class customer:

    def __init__(self, nom, prenom):
        self.nom = nom
        self.prenom = prenom

    # methode se presenter
    def se_presenter(self):
        print('je suis dev frontent{} {} et  '.format(self.nom,self.prenom))


# class child
class Patron(customer):
    def __init__(self, nom, prenom, voiture):
        customer.__init__(self, nom, prenom)
        self.voiture = voiture

    # methode se deplacer
    def se_deplacer(self):
        print('soyez tranquille a bord de ma {}'.format(self.voiture))


# creation d'un patron et instance
patron = Patron('diallo', 'saidou', 'carina3')
patron.se_presenter()
patron.se_deplacer()
