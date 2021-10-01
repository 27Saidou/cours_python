def divide(x, y):
    try:
        result=x/y
    except ZeroDivisionError:
        print("division by zero!")
    else:
        print("Le result est={0}".format(result))
    finally:
        print("executing finally clause")

divide(2,0)


def demander_age():
    """cette permet de demander l'age et le nom d'une personne"""
    age_int=0
    while age_int==0:
        age_str = input("Quel est votre age")
        try:
            age_int = int(age_str)
        except:
            print('Erreur ,Vous devez un nombre Entier pour l\'age')
        return age_int
nom=""   
while nom=="":
    nom = input("Quel est votre nom")

age=demander_age()
# afficher le resulat
print("Vous vous appelez"+nom+",Vous avez" +str(age)+"ans")
print("L'an prochain vous aurez " +str(age+1)+ " ans ")

