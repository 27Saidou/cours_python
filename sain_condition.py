age = int(input("Quel est votre age !"))
if age == 17:
    print("Vous etes presque majeur")
elif 12 <= age <= 18:
    print("Vous etes adolescent")
elif age == 1 or age == 2:
    print("Vous etes un bebe")
elif age == 18:
    print("Felicitation vous etes tout juste majeur")
elif age > 60:
    print("Vous etes senior")
elif age < 10:
    print("Vous etes enfants")
elif age >= 18:
    print("Vous etes majeur")
else:
    print("Vous etes un enfant")
