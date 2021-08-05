def factoriel(num):
    if num == 1:
      return 1
    else:
        return(num* factoriel(num-1))
num=5
    
print("Le factoriel de ",num,"est",factoriel(num))