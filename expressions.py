import re,os
masque1="ier"
r1=re.compile(masque1)
print(r1)

# with open("pierre.txt","w+") as file:
#     file.write("je suis un dev django")
#     file.flush()
#     file.close()
    
# with open("pierre.txt","r") as fichier:
#         print(fichier.read())
#         fichier.close()

def fichier_existe():
    if os.path.exists("pierre.txt"):
        print("le fichier existe deja") 
    else:
        pres="engineer java"
        with open("pierre.txt","w+") as f:
            f.write(pres)
            f.close()
# appelle fonction
fichier_existe()            