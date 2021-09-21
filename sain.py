def demander_nom():
    reponse_nom=""""""
    while reponse_nom=="":
        reponse_nom=input("Quel est votre nom")
    return reponse_nom

# Il y a 33 mots-clés dans Python 3.7.

def demander_age():
    age_int=0
    while age_int==0:
        age_int=input("Donner votre age")
    try:
        age_int = int(age_int)
    except:
        print('Erreur. Vous devez rentrer un entier pour age')
    return age_int

# demander nom
nom=demander_nom()
# demander age
age=demander_age()  
    # afficher le resultat
print("Tu t'appelle "+nom +",et Vous avez " + str(age)+"ans ")
print("L'an prochain tu auras " +str(age+1)+" ans ")
