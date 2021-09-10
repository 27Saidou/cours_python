def ajouterEtudiant():
    f=open("listEtudiants.txt","a")
    nom=input("donnez le nom de l'etudiant")
    f.write("\n")
    f.write(str(nom))
    f.close()
    print("Etudiant enregistrer avec success\n")

def listerEtudiant():
    f=open("listEtudiants.txt","r")
    print("afficher la liste des etudiants")
    for i in f:
        print(f"{i}")
    f.close()

def rechercheEtudiant():
    f=open("listEtudiants.txt","r")
    nomRecherche=input("Entrez le nom de l'etudiant a chercher")
    if nomRecherche in f.read():
        print(nomRecherche,"nomRechercher est dans la liste")
    else:
        print(nomRecherche,"le nom de l'etudiant chercher n'est pas dans la liste")
    f.close() 

def menu():
    print("1.ajouter un étudiant!")
    print("2.rechercher un étudiant!")
    print("3.Voir la liste des etudiants !")
    print("Quitter")
    choix=input("dis moi ce que tu veux faire 1,2,3 ou 4")
    if choix=="1":
        ajouterEtudiant()
        menu()
    elif choix=="2":
        rechercheEtudiant()
        menu()
    elif choix=="3":
        listerEtudiant()
        menu()
    elif choix=="4":
        print("au revoir ")
    else:
        print("Votre choix est invalid")  


# appelle des trois fonctions ajouter etudiant et listeretdiant puis chercheretudiant
ajouterEtudiant()
listerEtudiant()
rechercheEtudiant()
menu()
