counter = 0

while counter < 3:
    print("Python est un lanage de programmation")
    counter = counter + 1
else:
    print("oups!")

# exemple de l'utilisation de break en python
for val in "string":
    if val == "i":
        break
    print(val)

print("La fin")

# exemple de l'utilisation de continue en python 
for val in "string":
    if val == "i":
        continue
    print(val)

print("La fin")

# exemple de la fonction pass
sequence = {'p', 'a', 's', 's'}
for val in sequence:
    pass
    print(val)
