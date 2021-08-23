class SalaryNotInRangeError(Exception):
    
    def __init__(self, salary, message="le salaire n'est pas dans la plage(5000,15000)"):
        self.salary = salary
        self.message = message
        super().__init__(self.message)


salary = int(input("Entrez un salaire de compte: "))
if not 5000 < salary < 15000:
    raise SalaryNotInRangeError(salary)
