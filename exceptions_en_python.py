
# gestion des exceptions en python
try:
    num = int(input("Entrez un nombre: "))
    assert num % 2 == 0
except:
    print("pas un nombre pair!")
else:
    reciprocal = 1/num
    print(reciprocal)
