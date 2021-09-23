class Infiter():

    def __iter__(self):
        self.num = 1
        return self

    def __next__(self):
        num = self.num
        self.num += 2
        return num

alfa=iter(Infiter())       
print(next(alfa))
print(next(alfa))
print(next(alfa))
print(next(alfa))
