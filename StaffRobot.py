class Robot:
    def __init__(self, name):
        self.name = name

    def say_hi(self):
        print("Hi, I am " + self.name)


class PhysicianRobot(Robot):
    pass


x = Robot("Marvin")
y = PhysicianRobot("James")
print(isinstance(x,Robot),isinstance(y,PhysicianRobot))
print(type(x),type(y))