for i in range(1, 11):
    print(i)
    if i == 5:
        break
def demander_num(num):
    """function qui double la valeur"""
    return 2*num
print(demander_num.__doc__)  

drink = "Disponible"
food = None


def menu(x):
    if x == drink:
        print(drink)
    else:
        print(food)
        
menu(drink)
menu(food)
