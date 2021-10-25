class MyNewClass():
    """This class demonstrates the creation of objects"""

    # instance attribute
    num = 100
    # instance method
    def bonjour(self):
        print("bonjour les devs ")
obj=MyNewClass()        
print(obj.num)
obj.bonjour()
print(MyNewClass.__doc__)