prenoms=["Alpha","RamaNd"]
age=[27,22]
infos=prenoms+age
print(infos)

# creation de tuple en python
t=("Massoud",27,["engineer","developpeur mobile java"])
prenom,age,profession=t
print(t)

# creation d'un dictionaries en python
d={"prenom":"alpha","age":27,"profession":["engineer java"]}
d["email"]="massoud2021@gmail.com"
del d["email"]
print(d)

# example d'operateur de logique en python_dev
x,y=1,5
if not x>=5:
  print("x contient une valeur strict a 5.ou inferieur a 5")
else:
    print("x contient une valeur superieur ou egale a 5")