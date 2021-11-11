def welcome(name):
    print("hello "+name+b" Engineer java")


def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while a < n:
        print(a, end=' ')
        a, b = b, a+b
    print()


def fib2(n):   # return Fibonacci series up to n
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a+b
    return result

person1 = {
    "name": "Massoud Afghan",
    "age": 19,
    "country": "India"
    "education”: “IIT Jodhpur"
}

def addition(a, b):
    resulat=a+b
    return resulat

def soustration(a, b):
    res = a-b
    return res

def multiplication(a, b):
    massoud = a*b
    return massoud
