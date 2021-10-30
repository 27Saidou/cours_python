def premier(n):
    cpt = 0
    for i in range(2, (n//2)+1):
        if n % i == 0:
            cpt = 1
    if cpt == 0 and n > 1:
        return True
    else:
        return False

n = -1
while n <= 0:
    n = int(input("Entrer un nombre entier positif"))
if premier(n) == True:
    print(f" est un nombre premier {n}".format(n))
else:
    print(f"n 'est pas un nombre premier {n}".format(n))
