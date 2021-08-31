def factorielle(n):
    if n==0:
        return 1
    else:
        return factorielle(n-1)*n

fact=factorielle(5)
print(fact)