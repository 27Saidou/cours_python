class DeveloperMobile:
    def __init__(self):
        self._salary=None

    @property
    def salary(self):
        return self._salary
    
    @salary.setter
    def salary(self,value):
        self._salary = value

    @salary.deleter
    def salary(self):
        del self._salary

se=DeveloperMobile()
se.salary=6000
print(se.salary)
#del se.salary
print(se.salary)