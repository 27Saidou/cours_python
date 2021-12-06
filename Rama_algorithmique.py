first_number=int(input("Entrez votre premier nombre"))
operator=input("choisir un un operateur (*,+,-,%,/):")
second_number=int(input("Entrez votre second_number"))
if operator=="+":
    result=first_number+second_number
    print(result)
elif operator=="-":
    result=first_number-second_number
    print(result)
elif operator=="*":
    result=first_number*second_number
    print(result)
elif operator=="%":
    result=first_number%second_number
    print(result)
elif operator=="/":
    result=first_number/second_number
    print(result)
else:
    print("Invalid operateur veuillez saisir un operateur valide")