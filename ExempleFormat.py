name,age,sal="alpha diallo",27,1000.35
# premier facon d'afficher les variables
print(name,age,sal)
# second format d'afficher les variables
print("Name:%s Age:%d Sal:%g" % (name,age,sal))
# troisieme format d'afficher les variables
print("Name est=",name)
print("Age est ",age)
print("Sal est",sal)
# Quatrieme format d'afficher les variables
print("Name{} Age:{} Salaire:{}".format(name,age,sal))
# cinquieme format  d'afficher les variables
print("Name{0} Age:{1} Salaire:{2}".format(name,age,sal))
# septieme facon de formatage de variable
print(f"{name} {age} {sal}")
# 8 facon de formatage de variable
print(f"Name={name} Age={age} salaire={sal}".format(name,age,sal))
