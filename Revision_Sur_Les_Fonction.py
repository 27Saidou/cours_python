# Une fonction est un bloc de code qui prend en 
# charge certaines données et, soit effectue une sorte de
#  transformation et renvoie les données transformées, 
#  soit effectue une tâche sur les données, ou les deux

def add_two_numbers(num1, num2):
    """exemple de function en python """
    
    result = num1+ num2
    return result
print(add_two_numbers(75, 123))
print(add_two_numbers.__doc__)
