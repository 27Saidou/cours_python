from abc import ABC, abstractmethod
class A(ABC):

    @abstractmethod
    def show(self):
        print("je suis une methode abstract")

class B(A):
    def show(self):
        print("j'implements la methode abstract")

if __name__ == "__main__":
    objB=B()
    objB.show()