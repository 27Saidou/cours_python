def decorat_test_example(func):
    def hello():
        print("je suis dev python")
        func()

    return hello

@decorat_test_example
def bonjour_hello():
    print("je suis un dev mobile android")


bonjour_hello()


  