# class parent
class Bird:

    def __init__(self):
        print("L'oiseau est pret")
    def whoisThis(self):
        print("Bird")

    def swim(self):
        print("Nager plus vite")

# class enfant
class Penguin(Bird):

    def __init__(self):
        # appelle function super class
        super().__init__()
        print("Penguin est Pret")

    def whoisThis(self):
        print("Mancho")

    def run(self):
        print("Cours plus vite")


peggy = Penguin()
peggy.whoisThis()
peggy.swim()
peggy.run()
