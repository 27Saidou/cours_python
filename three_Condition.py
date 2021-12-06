old_age =int(input("Entrez une age valide svp"))
if old_age >= 18:
    print("Vous etes adulte")
    print("Tu peux voter")
elif old_age < 18 and old_age > 3:
    print("Tu peux aller a l'ecole ")
else:
    print("Tu es un enfant ")
    print("Thank you ")
