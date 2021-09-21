fruits = ["apple", "mango", "orange"]  # list
numbers = (1, 2, 3)  # tuple
alphabets = {'a': 'apple', 'b': 'ball', 'c': 'cat'}  # dictionary
vowels = {'a', 'e', 'i', 'o', 'u'}  # set
fruits.append("Toshiba")
print(fruits)
print(numbers)
print(alphabets)
print(vowels)


num_int = 123
num_str = "456"

print(type(num_int))
print(type(num_str))
num_str = int(num_str)
print("Voici comment on fais le casting en python en utilisant la conversion explicite:", type(num_str))

num_sum = num_int + num_str

print("Sum of num_int and num_str:", num_sum)
print("Data type of the sum:", type(num_sum))
