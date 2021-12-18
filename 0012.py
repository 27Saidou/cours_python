def agenda(nom, prenom, tel):
    return{'nom': nom, 'prenom': prenom, 'tel': tel}


res = agenda('Diallo', 'Massoud', 771412725)
print(res)

age = int(input("Entrez votre age svp"))
if age <= 18:
    print("Mineur")
else:
    print("Majeur")
    print("Fin")
