nombres = [4, 5, 6]
for nb in nombres:
    if nb == 5:
        print("Le test est vrai")
        print(f"car la variable nb vaut {nb}")

x = 2
y = 2
if x == 2 and y == 2:
    print("le test est vrai")

for i in range(5):
    if i > 5:
        break
    print(i)


def polynome(x):
    return (x**2 - 2*x + 1)


def calc_vals(debut, fin):
    liste_vals = []
    for x in range(debut, fin + 1):
        liste_vals.append(polynome(x))
    return liste_vals


print(calc_vals(-5, 5))


def calc_factorielle(nb):
    if nb == 1:
        return 1
    else:
        return nb * calc_factorielle(nb - 1)


# prog principal
print(calc_factorielle(4))


def hello(prenom):
    print(f"Bonjour {prenom}")

# Programme principal.
x = 10
hello("Alfa")
print(x)