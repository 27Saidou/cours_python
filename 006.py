class Circle:
    pi = 3.14

    def __init__(self, redius):
        self.radius = redius

    def calculate_area(self):
        print("Aire du circle :", self.pi * self.radius * self.radius)


class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def calculate_area(self):
        print("Air du Rectangle :", self.length * self.width)

# function
def area(shape):
    # call action
    shape.calculate_area()


# create object
cir = Circle(5)
rect = Rectangle(10, 5)
area(cir)
area(rect)
