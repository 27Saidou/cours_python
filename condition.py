num = 1122
if 9 < num < 99:
    print("Two digit number")
elif 99 < num < 999:
    print("Three digit number")
elif 999 < num < 9999:
    print("Four digit number")
else:
    print("number is <= 9 or >= 9999")

print("========================")
num = -99
if num > 0:
    print("Positive Number")
else:
    print("Negative Number")
    if -99 <= num:
        print("Two digit Negative Number")
