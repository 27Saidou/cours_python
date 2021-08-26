class Counter:

    def __init__(self):
        # call private membre
        self.__current = 0

    def increment(self):
        self.__current +=1
        
    def value(self):
        self.__current
    
    def reset(self):
        self.__current=0

counter=Counter()
counter.increment()
print(counter._Counter__current)