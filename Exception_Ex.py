nombre1 = input("Donner le numerateur: ")
nombre2 = input("Donner le denominateur: ")

try:
    nombre1 = float(nombre1)
    nombre2 = float(nombre2)
    resultat = nombre1 / nombre2
except ValueError:
    print("Veuillez saisir des nombres s'il vous plait")
except ZeroDivisionError:
    print("Division par zero impossible")
else:
    print("{0}/{1} = {2} ".format(nombre1, nombre2, resultat))
