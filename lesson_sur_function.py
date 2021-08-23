# function_nom
def course_func(name, course_name):
    print("Bonjour", name, "Bienvenue a bailobaya")
    print("Votre nom du cours est", course_name)

# appelle de la function
course_func('John', 'Python')

# function_nom
def calculator(a, b):
    add = a + b
    # retouner une addition
    return add

# appelle de la fonction 
# prendre la valeur de retour de la variable
res = calculator(20, 5)
print("Addition :", res)


# function
def even_odd(n):
    # check numne ris even or odd
    if n % 2 == 0:
        print('Even number')
    else:
        print('Odd Number')
# calling function by its name
even_odd(19)


def arithmetic(num1, num2):
    add = num1 + num2
    sub = num1 - num2
    multiply = num1 * num2
    division = num1 / num2
    # return four values
    return add, sub, multiply, division


#lire les valeurs des variables
a, b, c, d = arithmetic(10, 2)

print("Addition: ", a)
print("Subtraction: ", b)
print("Multiplication: ", c)
print("Division: ", d)

global_lang = 'DataScience'

local_lang='Python'

def var_scope_test():
    global local_lang

var_scope_test()
print(global_lang)
print(local_lang)


def even_numbers(nums):
    even_list = []
    for n in nums:
        if n % 2 == 0:
            even_list.append(n)
    return even_list


num_list = [10, 5, 12, 78, 6, 1, 7, 9]
ans = even_numbers(num_list)
print("Even numbers are:", ans)


