class Client():
    """
    Variable de class example en python
    """

    compte = 0

    def __init__(self, number, nom, prenom, tel, address):
        self._number = number
        self._nom = nom
        self.prenom = prenom
        self.tel = tel
        self.address = address
        Client.compte += 1

    def __str__(self):
        """cette methode permet de presenter le Client"""

        return "Number:{0}\
            \nNom:{1}\
            \nPrenom:{2}\
            \nTel:{3}\
            \nAddress:{4}".format(self.number, self.nom, self.prenom, self.tel, self.address)

    def _getNumber(self):
        return self._number

    def _setNumber(self, newNumber):
        self._number = newNumber

    number = property(_getNumber, _setNumber)

    def _getNom(self):
        return self._nom

    def _setNom(self, newname):
        self._nom = newname

    nom = property(_getNom, _setNom)


c2 = Client(1, 'Diallo', 'Alfa', '621072627', 'Bilobate')
print('Vous avez creer', Client.compte, ' un client')
print(c2)
