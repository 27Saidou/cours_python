def demander_nom():
    """cette fonction permet de demander un nom a une personne"""
    reponse_nom=""
    while reponse_nom=="":
        reponse_nom=input("Quel est votre nom!")
    return reponse_nom
nom=demander_nom()
# afficher le resulat de la fonction
print(f"Vous appelez{nom}".format(nom))     