num = 1122
if 9 < num < 99:
    print("Two digit number")
elif 99 < num < 999:
    print("Three digit number")
elif 999 < num < 9999:
    print("Four digit number")
else:
    print("number is <= 9 or >= 9999")


numbers = [1, 2, 4, 6, 11, 20]

square=0
for i in numbers:
    square=i*i
    print(square)