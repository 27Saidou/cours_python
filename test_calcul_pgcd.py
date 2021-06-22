def pgcd(a, b):
    if b == 0:
        return a
    else:
        return pgcd(b, a % b)


a = int(input("Veuillez entrer la valeur de a"))
b = int(input("Veuillez entrer la valeur b"))
print("le PGCD de ", a, "et", b, "est", pgcd(a, b))
