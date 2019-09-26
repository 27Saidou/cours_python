def max(a,b):
    if a > b:
       return a
    else:
       return b 


first_value=int(input("Enter your first value"))
second_value=int(input("Enter your second value"))
res=int((first_value+second_value))

print(" la valeur max est de {}".format(max(first_value,second_value)))
print(res)





