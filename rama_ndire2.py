for num in [20, 11, 9, 66, 4, 89, 44]:
    # Skipping the iteration when number is even
    if num % 2 == 0:
        continue
    # This statement will be skipped for all even numbers
    print(num)
    
print("=============================")   
for num in [20, 11, 9, 66, 4, 89, 44]:
    if num % 2 == 0:
        pass
    else:
        print(num)
