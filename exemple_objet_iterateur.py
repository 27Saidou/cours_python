
class PowTwo:
    

    def __init__(self, max=0):
        self.max = max

    def __iter__(self):
        self.n = 0
        return self

    def __next__(self):
        if self.n <= self.max:
            try:
                result = 2 ** self.n
                self.n += 1
                return result
            except StopIteration:
                pass

numbers=PowTwo(3)
i=iter(numbers)
print(next(i))
print(next(i))
print(next(i))
print(next(i))

