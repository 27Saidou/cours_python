def make_pretty(func):
    def inner():
        print("Je suis un decorateur")
        func()
    return inner

@make_pretty
def ordinary():
    print("je suis dev mobile")

ordinary()    
