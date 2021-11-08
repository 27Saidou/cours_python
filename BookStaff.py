class Book:
    def __init__(self, pages):
        self.pages = pages

    # surcharge + operateur et method magic
    def __add__(self, other):
        return self.pages + other.pages


b1 = Book(400)
b2 = Book(300)
print("Total nombre de pages : ", b1 + b2)
print([10,20,30]+['diallo','engineer java','rama'])


class Shape:
    # function with two default parameters
    def area(self, a, b=0):
        if b > 0:
            print('La superficie de la place est: ', a * b)
        else:
            print('L\'aire du rectangle est: ', a ** 2)


square = Shape()
square.area(5)

rectangle = Shape()
rectangle.area(5, 3)

for i in reversed([ 'Diallo', 'engineer java','java']):
    print(i,end='')

