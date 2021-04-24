user="alpha2"
def decorat_test_example(func):
    def fonction_modifie():
        if user =="alpha":
            return func()
        else:
            print("Vous devez etre connecté!")
    return fonction_modifie



@decorat_test_example
def profile():
    print("membre!")

profile()    





