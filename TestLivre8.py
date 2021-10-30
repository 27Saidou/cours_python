from TestLivre7 import ajouter_un,saisir_un_entier,triangleRectangle,table_de_multiplication,creer_tableau,affiche_tableau
age=int(input("Entrer votre age s'il vous plait"))
print("Vous avez",age,"ans ")
age_plus_un=ajouter_un(age)
print("Dans un an vous aurez",age_plus_un,"ans ")
val=saisir_un_entier()
triangleRectangle(val)
table_de_multiplication(val)
T=[]
n=saisir_un_entier()
creer_tableau(T,n)
affiche_tableau(T,n)