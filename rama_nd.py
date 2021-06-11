pres="je m'appelle saidou .\nJ'ai 29 ans"
with open('pierre.txt', "w+") as file:
    file.write(pres)
    file.seek(0)
    print(file.read())
    file.seek(3)
    print(file.read(9))
    file.seek(0)
    print(file.readline())
    file.close()