# Entrez le nom et l'age de la personne 
import sys
try:
    nom = input("Entrez votre nom s'il vous plait")
    age = input("Entrez votre Age s'il vous plait Mr.")
except SyntaxError as e:
    sys.exit(1)
    print("Error, Invalid caractere!!")
try:
    print("Vous devez Entrez un nom et une age valide")
except IOError:
    sys.exit(1)
    print('Erreur dans le code oups!')
else:
    print("Vous etes " + nom + ",Vous avez " + age + "ans")
