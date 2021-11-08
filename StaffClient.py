with open("StaffEngineer.txt",'w') as fp:
    fp.write("je suis un developpeur java ")
    fp.close()

def affichageFichierClient():
    with open("staffEngineer.txt",'r') as fp:
        contenu=fp.read()
        print(contenu)
        fp.close()
affichageFichierClient()