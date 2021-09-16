class Student:

    def __init__(self, name, age):
        self.name = name  # instance attribute
        self.age = age  # instance attribute

    @classmethod
    def getobject(cls):
        return cls('Alpha', 25)

    @staticmethod
    def tostring():
        print('etudiant de classe')

etudiant=Student.getobject()
print(etudiant.name)
print(etudiant.age)
etudiant.tostring()
