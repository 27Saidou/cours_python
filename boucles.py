import sys
try:
    n=int(input("Donnez une valeur"))
    i=1
    while i<=10:
        print(n,'*',i,'=',n*i)
        i+=1
except ValueError :
    print("Oops!,Entrez un nombre entre 0 a 9")
  