class Animal_Polymorphism():
    def info(self):
        print('Je suis un Animal')

    def make_sound(self):
        pass

class Cannard(Animal_Polymorphism):
    def info(self):
        print('Je suis un Cannard')

    def make_sound(self):
        print('Quack Quack')


class Chien(Animal_Polymorphism):
    def info(self):
        print('Je suis un chien')

    def make_sound(self):
        print('Bow Wow')


d = Cannard()
d.info()
d.make_sound()
d = Chien()
d.info()
d.make_sound()

