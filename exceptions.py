import sys
try:
    nombre1=int(input("Donnez la valeur du nombre 1"))
    nombre2=int(input("Donnez la valeur de nombre2"))
except ValueError:
    print("Error: Invalid character")
    sys.exit(1)
try:
    result=nombre1/nombre2
except ZeroDivisionError:
    print("Error: Division by zero Impossible") 
    sys.exit(1)
print(f"{nombre1}/{nombre2}={result}")