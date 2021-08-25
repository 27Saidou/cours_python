def somme(*args):
    s=0
    for n in args:
        s+=n
    print(s)
somme(1,2,3,4)

def pres(**kwargs):
    for i,v in kwargs.items():
        print(i,v)
        
pres(prenom="alpha",age=27,profession="engineer java")

def ordre(a,b):
    if a<=b:
        return a,b
    else:
        return b,a 
ordonne=ordre(22,12)
print(ordonne)

def factoriel(n):
    if n == 0:
        return 1
    else:
        return n*factoriel(n-1)

fact=factoriel(4)
print(fact)
        
        