class Parrot:

    # instance attributes
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # instance method
    def sing(self, song):
        return "{} chante {}".format(self.name, song)

    def dance(self):
        return "{} danse maintenant".format(self.name)


# instantiate the object
blu = Parrot("Blu", 10)

# call our instance methods
print(blu.sing("'Happy'"))
print(blu.dance())
print(isinstance(blu, Parrot))
