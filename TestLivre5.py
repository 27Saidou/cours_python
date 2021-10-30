Tab = []
# permet d'ajouter des employees
def creation_Tableau_Employee(Tab):
    rep = "oui"
    while rep == "oui":
        print("Entrer le matricule de l'employee\t")
        matricule = input("")
        nom = input("Entrer le nom  du nouveau employee")
        prenom = input("Entrer le nouveau prenom de l'employee:")
        service = input("Entrer le service du nouveau employee :")
        fonction = input("Entrer le fonction du nouveau employee:")
        salaire_de_base = int(
            input("Entrer le salaire de base du nouveau employee :"))
        info = matricule+"\t"+nom+"\t"+prenom+"\t"+service + \
            "\t"+fonction+"\t"+str(salaire_de_base)+"\n"
        Tab.append(info)
        rep = input("Voulez-vous ajouter un autre employee O/N :")

# permet d'afficher la version du tableau employee 1
def afficher_Tableau_Employee_Version_1(Tab):
    print("Les employees du tableau sont :")
    print(Tab)

# permet d'afficher la version du tableau employee 2
def afficher_Tableau_Employee_Version_2(Tab):
    print("Les employees du tableau sont :")
    for i in range(len(Tab)):
        print(Tab[i], end='\t')
    print("\n")

# permet de faire  le decalage_a_droite
def decalage_a_droite(Tab):
    n = len(Tab)
    i = n-1
    tmp = Tab[n-1]
    while i > 0:
        Tab[i] = Tab[i-1]
        i -= 1
        Tab[0] = tmp

# creation du menu de choix
def menu():
    choix = 1
    while choix != 4:
        print("\n\n \t\t MENU\n")
        print("\n\n \t\t 1 - Creation Tableau Employee \n")
        print("\n\n \t\t 2 - Affichage Tableau Employee \n")
        print("\n\n \t\t 3 - Decalage a droite du Tableau Employee \n ")
        print("\n\n \t\t 4 - Quitter Application  \n")
        print("\n\t\t  faites votre choix", end='\t')
        choix = int(input(""))
        if choix == 1:
            creation_Tableau_Employee(Tab)
        if choix == 2:
            print("\t\tPremier possibilite d'affichage du tableau")
            afficher_Tableau_Employee_Version_1(Tab)
            print("\t\tDeuxieme possibilite d'affichage du tableau")
            afficher_Tableau_Employee_Version_2(Tab)
        if choix == 3:
            decalage_a_droite(Tab)
        if choix == 4:
            print("Au revoir et a la prochaine ")
        if choix < 1 or choix > 4:
            print("Mauvaise choix,car le choix n'existe pas ")


menu()
