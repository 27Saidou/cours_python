def ajouter_un(v):
    return v+1

def table_de_multiplication(n):
    print("Table de multiplication de :",n)
    for i in range(13):
        print(n,"x",i,"=",(n*i))

def triangleRectangle(n):
    for i in range(n+1):
        print(i*" X")


def creer_tableau(T,n):
    for i in range(n):
        print("Entrer la valeur de la cellule",i+1)
        val=int(input(""))
        T.append(val)

def affiche_tableau(T,n):
    for i in range(n):
        print(T[i],end='\t')

def saisir_un_entier():
    n=int(input("Entrer une valeur entier "))
    return n