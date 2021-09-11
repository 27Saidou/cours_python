from abc import ABC, abstractmethod

class A(ABC):
    def __init__(self,value):
        self.value = value

    @abstractmethod
    def add(self):
        pass

    @abstractmethod
    def sub(self):
        pass 

class Y(A):

    def add(self):
        return self.value +100

    def sub(self):
        return self.value -10

obj=Y(100)
print(obj.add())
print(obj.sub())