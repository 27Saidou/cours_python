import config,update
print(config.a)
print(config.b)
x=20
def toto():
    x = 20
    def bar():
        global x
        x = 25
    print("Je suis un developpeur web&mobile", x)
    print("appelle developpeur maintenant",x)
    bar()
    print("apres l'appelle developpeur de la function bar: ", x)


toto()
print("x in main: ",x)
