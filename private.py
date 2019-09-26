class CoffeeMachine:


    Water_LEVEL=100
    def _start_machine(self):
        if self.Water_LEVEL >20:
            return True
        else:
            print("Please add water")
            return False 

    def __boil_water(self):
         return "booling....."

    def make_coffee(self):
        if self._start_machine():
            self.Water_LEVEL -=20
            print(self.__boil_water())
            print("Coffee is ready my dear")  

machine=CoffeeMachine()
# for i in range(0,5):
#     machine.make_coffee()              
print("Make coffee:public ",machine.make_coffee())
print("Start machine:protected ", machine._start_machine())
print("Boil Water :private ", machine._CoffeeMachine__boil_water())
