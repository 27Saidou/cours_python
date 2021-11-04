# creation du tableau qui va stocker les employees
Tab = []

# permet d'ajouter des employees
def creationTableauEmploye(Tab):
    rep = "oui"
    while rep == "oui":
        print("Entrer le matricule du nouveau employee")
        matricule = input("")
        nom = input("Entrer le nom du nouveau employee")
        prenom = input("Entrer le prenom du nouveau employee")
        service = input("Entrer le service du nouveau employee")
        fonction = input("Entrer le fonction du nouveau employee")
        salBase = int(input("Entrer le salBase du nouveau employee"))
        info = matricule+"\t"+nom + "\t"+prenom+"\t" + \
            service+"\t"+fonction+"\t"+str(salBase)+"\n"
        Tab.append(info)
        rep = input("Voulez-vous ajouter un autre Employee: ")

# permet de faire l'affichage des employees du tableau version 1
def afficheTableauEmployeversion1(Tab):
    print("Les employees du tableau sont :")
    print(Tab)

# permet d'afficher les employees du tableau Version 2
def afficheTableauEmployeversion2(Tab):
    print("les employees du tableau sont :")
    for i in range(len(Tab)):
        print(Tab[i], end='\t')
        print("\n")

# permet de faire le decalage a droite
def decalageADroite(Tab):
    n = len(Tab)
    i = n-1
    tmp = Tab[n-1]
    while i > 0:
        Tab[i] = Tab[i-1]
        i -= 1
        Tab[0] = tmp

# cette method permet de faire le choix
def menu():
    choix = 1
    while choix != 4:
        print("\n\n\t\t\t Menu \n")
        print("\n\n\t\t 1 - Creation Tableau Employee \n")
        print("\n\n\t\t 2 - Affichage Tableau Employee \n")
        print("\n\n\t\t 3 - Decalage a droite du Tableau Employee \n")
        print("\n\n\t\t 4 - Quitter Application \n")
        print("\n\t\t  - Faites votre choix", end="\t")
        choix = int(input(""))
        if choix == 1:
            creationTableauEmploye(Tab)
        if choix == 2:
            print("\t\tPremier possibilite d'affichage du tableau'")
            afficheTableauEmployeversion1(Tab)
            print("\t\tDeuxieme possibilite d'affichage du tableau")
            afficheTableauEmployeversion2(Tab)
        if choix == 3:
            decalageADroite(Tab)
        if choix == 4:
            print("Au revoir et a la prochaine ")
        if choix < 1 or choix > 4:
            print("Mauvaise choix,car le choix n'existe pas ")


menu()
