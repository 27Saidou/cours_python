class Cat:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def info(self):
        print(
            f"Je suis un chat. mon nom est {self.name}. I am {self.age} ans.")

    def make_sound(self):
        print("Meow")


class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def info(self):
        print(
            f"je suis un chien. Mon nom est {self.name}. je suis  {self.age} ans.")

    def make_sound(self):
        print("Bark")


cat1 = Cat("Kitty", 2.5)
dog1 = Dog("Fluffy", 4)

for animal in (cat1, dog1):
    animal.make_sound()
    animal.info()
    animal.make_sound()
