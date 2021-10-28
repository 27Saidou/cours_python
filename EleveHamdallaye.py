def main():
    #recolter la premier note
    note1=int(input("Entrer la premier note de l'eleve"))
    #recolter la deuxieme note
    note2=int(input("Entrer la deuxieme note de l'eleve'"))
    #recolter la troisieme note de l'eleve'
    note3=int(input("Entrer la troisieme note de l'eleve"))
    #calculer la moyenne de l'eleve
    result=(note1+note2+note3)/3
    #afficher la moyenne de l'eleve'
    print(" La moyenne de l'eleve est de :"+str(result))
main()    