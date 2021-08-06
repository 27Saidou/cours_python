number = int(input("Enter number: "))

# checking the number
if number < 0:
    print("Le nombre entrer est negatif.") 
elif number > 0:
    print("Le nombre entrer est positif.")
elif number == 0:
    print("Nombre est égal a zero.")
else:
    print("Le nombre entrer n'est pas un nombre")
