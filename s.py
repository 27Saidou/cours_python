knights = {'gallahad': 'the pure', 'robin': 'the brave'}
for k,v in knights.items():
    print(k,v)

    print('{1} and {0}'.format('spam', 'eggs'))


class Dog:

    tricks = []             

    def __init__(self, name):
        self.name = name

    def add_trick(self, trick):
        self.tricks.append(trick)
e=Dog('chien')
e.add_trick('roll over') 


class Reverse:
    def __init__(self, data):
        self.data = data
        self.index = len(data)

    def __iter__(self):
        return self

    def __next__(self):
        if self.index == 0:
            raise StopIteration
        self.index = self.index - 1
        return self.data[self.index]
