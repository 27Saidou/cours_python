class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def __mul__(self, timesheet):
        print('Travaille pour ', timesheet.days, 'Jour')
        # calculate salary
        return self.salary * timesheet.days


class TimeSheet:
    def __init__(self, name, days):
        self.name = name
        self.days = days


emp = Employee("Alfa", 800)
timesheet = TimeSheet("Nafiou", 50)
print("la salaire est de: ", emp * timesheet)

# def calcul(a,b,c):
#     res=a+b+c
#     return res

# print(calcul(12,34,45))
