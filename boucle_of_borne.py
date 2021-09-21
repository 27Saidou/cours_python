
numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]

sum = 0
for val in numbers:
    sum = sum+val

print("La somme est", sum)

genre = ['bezos', 'steve jobs', 'bill gates']
for i in range(len(genre)):
    print("J'aime", genre[i])

print("===================")
student_name = 'ALfa'
marks = {'James': 90, 'Jules': 55, 'ALfa': 77}

for student in marks:
    if student == student_name:
        print(marks[student])
        break
else:
    print('Aucune entree avec ce nom trouvee.')
