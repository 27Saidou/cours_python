sample_list = ['Emma', 'Stevan', 12, 45.6, 1 + 2j, "Eric", ]
number_list = []
string_list = []
for item in sample_list:
    if isinstance(item, (int, float, complex)):
        number_list.append(item)
    elif isinstance(item, str):
        string_list.append(item)


print(string_list)

print(number_list)

