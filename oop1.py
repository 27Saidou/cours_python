class SoftwareEngineering:
    # class attributes
    alias = "KeyBoard Magician"

    def __init__(self, name, age, level, salary):
        # instance attributes
        self.name = name
        self.age = age
        self.level = level
        self.salary = salary

    # instance method
    def code(self):
        print(f"{self.name} is writting code....")

    # instance method
    def code_in_language(self, language):
        print(f"{self.name} is writting code in {language}....")

    # instance method
    def information(self):
        information = f"name={self.name},age={self.age},level={self.level},salary={self.salary}"
        return information

    # dunder method
    def __str__(self):
        information = f"name={self.name},age={self.age},level={self.level},salary={self.salary}"
        return information

    def __eq__(self, other):
        return self.name == other.name and self.age == other.age
        
    @staticmethod
    def entry_salary(age):
        if age < 25:
            return 5000
        if age < 30:
            return 7000
        return 9000


# instance
se1 = SoftwareEngineering("Massoud", 20, "Junior", 5000)
se2 = SoftwareEngineering("Alpha", 25, "Senior", 7000)
se1.code()
se1.code_in_language("Java")
se2.code_in_language("Python")
print(SoftwareEngineering.entry_salary(27))
