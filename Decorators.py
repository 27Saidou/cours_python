def announce(f):
    def wrapper():
        print("Wrapper function called")
        f()
        print("Done Function")
    return wrapper
@announce
def bonjour():
    print("je suis developpeur web et mobile")

bonjour()
    