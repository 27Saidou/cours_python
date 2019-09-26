
def main():
    #print('Hello World')
    #print("hello les gars de volkeno")
    # nom_utilisateur="Graven"
    # age=19
    # #afficher le username et l'age
    # print(nom_utilisateur,age)
    # age=age+1

    #recolter la valeur de la porte monnaie

    note1=int(input("Entrer la premier note"))
    #recolter la deuxieme note
    note2 =int(input("Entrer la seconde note"))
    #recolter la troisieme note de l'eleve
    note3=int(input("Entrer la troisieme note"))
    result=(note1+note2+note3)/3
    print("la moyenne est de {}".format(str(result)))

if __name__ == "__main__":
     main()
   