class Saidou():

    def __init__(self):
        self.course='java programmation cours'
        self.__tech='java'

    def CourseName(self):
        return self.course + self.__tech

obj=Saidou()
print(obj.course)
print(obj._Saidou__tech)
print(obj.CourseName())
