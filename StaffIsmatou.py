class Student:
    # class variables
    school_name = 'NIIT'

    def __init__(self, name, age):
        self.name = name
        self.age = age

    # instance method
    def show(self):
        # access instance variables
        print('Student:', self.name, self.age)
        # access class variables
        print('School:', self.school_name)

    @classmethod
    def change_School(cls, name):
        # access class variable
        print('precedant nom d\'ecole:', cls.school_name)
        cls.school_name = name
        print('Changement du nom d\'ecole', Student.school_name)

    @staticmethod
    def find_notes(subject_name):
        # can't access instance or class attributes
        return ['chapter 1', 'chapter 2', 'chapter 3']


# create object
jessa = Student('Alfa', 12)
# call instance method
jessa.show()

# call class method
Student.change_School('Bailobaya Technology')
