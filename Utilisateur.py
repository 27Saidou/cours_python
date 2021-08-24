#class Utilisateur(class de parent example heritage en python)
class Utilisateur():
    anciennete=0
    def __init__(self,nom,age):
        self.user_name=nom
        self.user_age=age
        
    def getNom(self):
        print("salut, je suis {self.user_name}") 
        
# class Client (example Heritage en python,class fille ou class enfant) 
class Client(Utilisateur):
    is_client=True  
    
    
utilisateur=Utilisateur("Diallo",27)
client=Client("Nafiou",22)
print(client.is_client)
print(client.user_name) 
print(isinstance(client,Client))       