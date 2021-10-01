def guest():
    invites = ["Ramatoulaye ", "Ismatou", "Kadiatou", "Musk","Agier"]
    nom=input("Votre nom")
    if nom.capitalize() in invites:
        print("Bonjour Monsieur/Madame",nom)
        print("Bienvenue")
    else:
        print("Désole Monsieur/Madame{},Vous ne faites pas parti de la listes.".format(nom))
guest()        
