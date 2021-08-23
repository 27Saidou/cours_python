student_name = 'Alfa'

marks = {'Massoud': 90, 'Jules': 55, 'Saidou': 77}

for student in marks:
    if student == student_name:
        print(marks[student])
        break
else:
    print('Aucune entree avec ce nom trouvee.')
