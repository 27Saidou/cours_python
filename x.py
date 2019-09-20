# def fib(n): 
#     a, b = 0, 1
#     while a < n:
#           print(a, end=' ')
#           a, b = b, a+b
# print()
# fib(2000)


def ask_ok(prompt, retries=4, reminder='Please try again!'):
    while True:
        ok = input(prompt)
        if ok in ('y', 'ye', 'yes'):
            return True
        if ok in ('n', 'no', 'nop', 'nope'):
            return False
        retries = retries - 1
        if retries < 0:
            raise ValueError('invalid user response')
        print(reminder)


ask_ok('mama', retries=4, reminder='Please try again!')


def f(a, L=[]):
    L.append(a)
    return L


print(f(1))
print(f(2))
print(f(3))
