age=[29,27,30,29]
if 31 not in age:
    print("Persone n'a 31 ans")
    
def factoriel(n):
    if n==1:
        return 1
    else:
        return n*factoriel(n-1)  
print(factoriel(4))