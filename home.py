from abc import ABC, abstractmethod
class Home(ABC):
    def __init__(self, name, num_of_months):
        self.name = name
        self.num_of_months = num_of_months

    # concrete method
    def display_user(self):
        print('User %s subscribed for %d months' %
            (self.name, self.num_of_months))

    # abstract method
    @abstractmethod
    def process_fee(self):
        pass
