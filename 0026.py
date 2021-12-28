class Addition():
    def __init__(self,x):
        self.x = x
    def __add__(self,other):
        result = self.x + other.x
        print("Result:", result)

a=Addition(2)
c=Addition(3)
a+c