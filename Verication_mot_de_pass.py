password = input("Entrer votre mot de passe")
password_length = len(password)
if password_length <= 8:
    print("mot de passe trop court")
elif 8 < password_length <=12:
    print("mot de passe moyen")
else:
    print("Mot de passe parfait !")
print(password_length)
