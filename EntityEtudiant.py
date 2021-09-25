from EntityClient import Client


class Etudiant(Client):
    def __init__(self, numero, nom, prenom, tel, address, filiere):
        Client.__init__(self, numero, nom, prenom, tel, address)
        self._filiere = filiere

    def _getFiliere(self):
        return self._filiere

    def _setFiliere(self, newfiliere):
        self._filiere = newfiliere

    filiere = property(_getFiliere, _setFiliere)

    def _getNom(self):
        return self._nom

    def _setNom(self, newname):
        self._nom = newname

    nom = property(_getNom, _setNom)

    def __str__(self):
        """cette methode permet de presenter l'etudiant"""
        return "Numero:{0}\
            \nNom:{1}\
            \nPrenom:{2}\
            \nTel:{3}\
            \nAddress:{4}\
            \nFiliere:{5}".format(self.number, self.nom, self.prenom, self.tel, self.address, self.filiere)


e1 = Etudiant(2, 'Diallo', 'Massoud', '77 123 34 56',
            'Bailobaya', 'Engineer Java')
print(isinstance(e1, Etudiant))
