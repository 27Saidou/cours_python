# f=open("test.txt",encoding="utf-8")
# f.close()
# print("fichier creer avec success")

# with open("test.txt", 'w', encoding='utf-8') as f2:
#     f2.write("je suis un developpeur mobile\n")
#     f2.write("mon grd frere est dev web&mobile\n\n")
#     f2.write("nafiou est un grd Commercant\n")
# print("fichier ajouter avec success")


with open("test.txt",encoding="utf-8") as f:
    print(f.read())
    print(f.tell())
    print(f.seek(0))
    f.close()
print(dir(locals()['__builtins__']))
