password=input("Entrer votre mot de passe")
password_length=len(password)

#créer notre condition
if password_length<=8:
    print("Mot de pass trop courte")
elif 8<password_length<=12:
    print("Parfait Mot de pass moyen")
else:
    print("Mot de pass Parfait")  
    print(password_length)      