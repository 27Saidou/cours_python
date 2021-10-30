import os


def creationFichier():
    """creation de fichier pour etudiant"""

    fe = open('ListeEtudiant.txt', 'w')
    reponse = "O"
    while reponse == "O":
        matricule = input("Entrer le matricule de l'etudiant :")
        nom = input("Entrer le nom de l'etudiant ")
        prenom = input("Entrer le prenom de l'etudiant:")
        classe = input("Entrer le classe de l'etudiant :")
        sexe = input("Entrer le sexe de l'etudiant :")
        addresse = input("Entrer le addresses de l'etudiant:")
        info = matricule+"\t"+nom + "\t"+prenom + \
            "\t"+classe+"\t"+sexe+"\t"+addresse+"\n"
        fe.write(info)
        reponse = input("Voulez-vous ajouter un etudiant O/N:")
        fe.close()


def LectureFichier():
    """ Permet de faire la Lecture du fichier """
    if os.path.is_file("ListeEtudiant.txt"):
        fe = open('ListeEtudiant.txt', 'r')
        contenu = fe.read()
        print("Le contenu du fichier d'etudiant est :")
        print(contenu)
        fe.close()
    else:
        print("Le fichier n'existe pas !!!!!!")


def ajouterEtudiantFichier():
    """Permet d'ajouter un etudiant"""

    fe = open("ListeEtudiant.txt", "a")
    reponse = 'O'
    while reponse == 'O':
        matricule = input("Entrer le matricule de l'etudiant :")
        nom = input("Entrer le nom de l'etudiant ")
        prenom = input("Entrer le prenom de l'etudiant:")
        classe = input("Entrer le classe de l'etudiant :")
        sexe = input("Entrer le sexe de l'etudiant :")
        addresse = input("Entrer le addresses de l'etudiant:")
        info = matricule+"\t"+nom + "\t"+prenom + \
            "\t"+classe+"\t"+sexe+"\t"+addresse+"\n"
        fe.write(info)
        reponse = input("Voulez-vous ajouter un etudiant O/N: E")
        fe.close()


def menu():
    """Creation du menu de choix"""
    choix = 1
    while choix != 4:
        print("\n\n\t\t  MENU PROGRAMME \n")
        print("\n\t\t\t 1 - Creation du fichier \n")
        print("\n\t\t\t 2 - Lecture  du fichier \n")
        print("\n\t\t\t 3 - Ajouter un etudiant dans le fichier \n")
        print("\n\t\t\t 4 - Quitter programme \n")
        choix = input("Faites votre choix : ")
        if choix == 1:
            creationFichier()
        if choix == 2:
            LectureFichier()
        if choix == 3:
            ajouterEtudiantFichier()
        if choix == 4:
            print("\n\n\t\t AU REVOIR ET BONNE JOURNEE")
        if choix > 4 or choix < 1:
            print("\n\n\n\t\t\t Le choix n'existe pas ")
