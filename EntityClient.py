class Client():
    """
    Variable de class exemple en python
    """
    
    compte=0
    def __init__(self,numero,nom,prenom,tel,address):
        self._numero = numero
        self._nom = nom
        self.prenom = prenom
        self.tel = tel
        self.address = address
        Client.compte+=1


    def __str__(self):
        """cette methode permet de presenter le Client"""
        
        return "Numero:{0}\
            \nNom:{1}\
            \nPrenom:{2}\
            \nTel:{3}\
            \nAddress:{4}".format(self.numero,self.nom,self.prenom,self.tel,self.address) 

    def _getNumero(self):
        return self._numero

    def _setNumero(self,newNumero):
        self._numero = newNumero

    numero=property(_getNumero,_setNumero)

    def _getNom(self):
        return self._nom 
    def _setNom(self,newname):
        self._nom = newname

    nom=property(_getNom,_setNom)


c2=Client(1,'Diallo','Alfa','621072627','Bailobaya')
print('Vous avez creer',Client.compte,' un client')
print(c2)