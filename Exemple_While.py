while True:
    nom = input("Entrez votre nom svp!")
    if nom =="stop":
        break
    age = int(input("Entrez votre age svp"))
    print("Bonjour %s,et Vous avez %d ans"%(nom,age))
