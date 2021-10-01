import random

nombre_p=random.randint(1,10)
nombre_u=0
while nombre_u != nombre_p:
    nombre_txt=input("Tapez un nombre")
    nombre_u=int(nombre_txt)
if nombre_p>nombre_u:
    print("c'est plus")
elif nombre_p<nombre_u:
    print("C'est moins!")
else:
    print("Bravo vous avez gagne!!!")    
