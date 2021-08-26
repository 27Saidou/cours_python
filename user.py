class User:
    def __init__(self, name, age):
        self.name = name
        self._age = age

    def display_user(self):
        print('User Name:', self.name)
        print('User Age:', self._age)


user = User('Alpha Diallo', 27)
# appelle des methodes de la classe
user.display_user()
# access aux variables
print(user.name)
print(user._age)
