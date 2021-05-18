n1=int(input("Donnez la valeur de n1"))
n2=int(input("Donnez la valeur de n2"))
n3=int(input("Donnez la valeur de n3"))
if n1>n2:
    max=n1
else:
    max=n2
if n3>max:
    max=n3
print(" le Maximum est",max) 

user="John2"
def check_User(fonction):
    def fonction_modifie():
        if user=="John":
            return fonction()
        else:
            print("Vous devez etre connecté!")
    return fonction_modifie  
    
@check_User
def profile():
    print("Profile Membre")

profile()