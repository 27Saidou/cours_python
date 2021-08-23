# parent class
class Bird:

    def __init__(self):
        print("L'Oiseau est pret")

    def whoisThis(self):
        print("Oiseau")

    def swim(self):
        print("Nager plus vite")

# child class
class Penguin(Bird):

    def __init__(self):
        # call super() function
        super().__init__()
        print("Le pingouin est pret")

    def whoisThis(self):
        print("Penguin")

    def run(self):
        print("Cours plus vite")


peggy = Penguin()
peggy.whoisThis()
peggy.swim()
peggy.run()
