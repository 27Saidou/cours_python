Mot=str(input("Entrez un mot"))
NB=len(Mot)
print("Ce mot compte ",NB,"lettres")

def Fact(n):
    if n ==0:
        return 1
    else:
        return Fact(n-1)*n
print(Fact(5))    