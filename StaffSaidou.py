class StaffSaidou:
    # class variables
    school_name = 'NIIT TECH'

    # constructor
    def __init__(self, name, age):
        # instance variables
        self.name = name
        self.age = age

    # instance variables
    def show(self):
        print(self.name, self.age, StaffSaidou.school_name)

    @classmethod
    def change_School(cls, name):
        cls.school_name = name

    @staticmethod
    def find_notes(subject_name):
        return ['chapter 1', 'chapter 2', 'chapter 3']


# create object
jessa = StaffSaidou('Jessa', 12)
# call instance method
jessa.show()

# call class method using the class
StaffSaidou.change_School('XYZ School')
# call class method using the object
jessa.change_School('PQR School')

# call static method using the class
StaffSaidou.find_notes('Math')
# call class method using the object
jessa.find_notes('Math')
