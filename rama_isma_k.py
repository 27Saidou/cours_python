number = int(input("Entrez une table de Multiplication de ton choix"))
count = 1
print("Table de multiplication de", number)
while count <= 10:
    number = number*1
    print(number, 'x', count, '=', number*count)
    count = count+1
