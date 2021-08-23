# f = open("test.txt", mode='r', encoding='utf-8')
# f.close()
f = open("test.txt", 'r', encoding='utf-8')
print(f.read())
f.close()

# with open("test.txt", 'w', encoding='utf-8') as f:
#     f.write("j'aime java\n")
#     f.write("c'est mon fichier\n\n")
#     f.write("contient trois lignes\n")
#     f.close()
