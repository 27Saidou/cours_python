def greet(name):
    """dire bonjour +name"""
    print("Bonjour "+ name +" Goodmorning")
greet("alfa")    

def absolute_value(num):
    """cette function retourne la valeur absolut d'un nombre"""
    if num>=0:
        return num
    else:
        return -num
print(absolute_value(-4))
print(absolute_value(2))

def my_funct():
    x=10
    print("la valeur de la variable",x)
x = 20
my_funct()
print("la valeur de la function qui est declarer en dehors :",x)

def dire_bonjour_a_des_personnes(name,message):
    print("Bonjour", name + ', ' + message)

dire_bonjour_a_des_personnes("commandant massoud","GoodMorning")

def dire_bonjour_les_devs(*names):
    """cette function permet d'ajouter autant de nom que l'on veut"""
    for name in names:
        print("Bonjour {name}".format(name=name))
dire_bonjour_les_devs("steve jobs","alfa diallo","saidou diallo") 

def factorial(num):
    """cette function permet de calculer le factorielle d'un nombre entier"""
    if num == 0:
        return 1
    else:
        return num*factorial(num-1)
num=5       
print("le factorielle de num est =",factorial(num))

# exemple de function lambda qui permet de faire le double d'un nombre
double=lambda x:x*2
print(double(5))

# exemple d'utilisation de la function filter
my_list = [1, 5, 4, 6, 8, 11, 3, 12]
new_list = list(filter(lambda x: (x % 2 == 0), my_list))
print(new_list)

# exemple d'utilisation de la function map en python
my_list = [1, 5, 4, 6, 8, 11, 3, 12]
new_list = list(map(lambda x: x * 2, my_list))
print(new_list)

# variable global
x = "global"
def foo():
    """exemple de variable global"""
    global x
    x=x*2
    print(x)

foo()
print("x a l'exterieur :", x)


def foo2():
    """exemple de variable local"""
    y = "local"
    print(y)
foo2()

x = "Engineer java"
def foo3():
    global x
    y = "local"
    x = x * 2
    print(x)
    print(y)
foo3()

x = 5
def function_exempt():
    """cette permet de montrer la difference entre la variable local est global en python"""
    x = 10
    print("Variable local x:", x)
function_exempt()
print("Variable global x:", x)


def outer():
    x = "local"
    def inner():
        nonlocal x
        x = "nonlocal"
        print("inner:", x)

    inner()
    print("outer:", x)
outer()

c=0
def add():
    global c
    c=c+2
    print("Ajouter a l'interieur de la function",c)
add() 
print("afficher a l'exterieur de la function",c)   

