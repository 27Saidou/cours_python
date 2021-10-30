def premier(n):
    i = 2
    while (i <= (n/2) and (n % i != 0)):
        i += 1
    if (i > (n/2) and (n > 1)):
        return True
    else:
        return False

n = -1
while n <= 0:
    n = int(input("Entrer un nombre entier positif !"))
if premier(n) == True:
    print(n, " est un nombre premier")
else:
    print(n, "n'est pas un nombre premier")
    print("fin!")
