class Personne():
    # relation has-a permet de creer une relation de dependance d'une class envers une autre en python(a un)
    def __init__(self,nom,prenom,address):
        self.nom = nom
        self.prenom = prenom
        self.address = address
        
        
class Address():
    def __init__(self,rue,code_postal,ville):
        self.rue =rue
        self.code_postal = code_postal
        self.ville =ville
        
        
address = Address(rue="17 rue d'ici",code_postal="78000",ville="conakry")
personne=Personne(nom='Diallo',prenom="Alpha",address=address)
print(isinstance(personne,Personne))
print(isinstance(address,Address))
        