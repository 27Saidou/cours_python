class Parrot:

    # class attribute
    species = "oiseau"

    # instance attribute
    def __init__(self, name, age):
        self.name = name
        self.age = age


# instantiate the Parrot class
blu = Parrot("Blu", 10)
woo = Parrot("Woo", 15)

# access the class attributes
print("Blu est un {}".format(blu.__class__.species))
print("Woo est aussi un {}".format(woo.__class__.species))

# access the instance attributes
print("{} est {} ans".format(blu.name, blu.age))
print("{} est {} ans".format(woo.name, woo.age))
