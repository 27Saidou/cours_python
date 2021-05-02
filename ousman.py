def incrementer():
    global a
    a+=1
    print(a)
a=18 
incrementer()
incrementer()

def factoriel(n=int):
    if n==0:
      return 1
    else:
      return n*factoriel(n-1)  
print(factoriel(5))      