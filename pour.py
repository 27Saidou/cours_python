for num in [11, 9, 88, 10, 90, 3, 19]:
    print(num)
    if(num == 88):
        print("je suis un dev java")
        print("Fin de la boucle")
        break
print("=========")
for num in [20, 11, 9, 66, 4, 89, 44]:
    if num % 2 == 0:
        continue
    print(num)
print("utilisation du mot cle pass en python")
for num in [20, 11, 9, 66, 4, 89, 44]:
    if num % 2 == 0:
        pass
    else:
        print(num)
