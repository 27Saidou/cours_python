def donner_votre_nom():
    first_name=input("Votre first_name")
    last_name=input("Votre lastName :")
    age=int(input("Veuillez donner votre age svp"))
    profession = input("Veuillez donner votre profession ")
    affiliation=input("Veuillez donner votre affiliation svp ")
    return f"Bonjour koto ,{first_name} {last_name},vous avez {age} ans ,et vous etes {profession},Vous etiez membre de {affiliation}".format(first_name=first_name,last_name=last_name,age=age,profession=profession,affiliation=affiliation)

print(donner_votre_nom())
