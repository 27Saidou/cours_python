class Developer(object):

    # Constructor
    def __init__(self, name):
        self.name = name

    def display(self):
        print("Developer:", self.name, "-")


class PythonDeveloper(Developer):

    # Constructor
    def __init__(self, name, language):
        self.name = name
        self.language = language

    def display(self):
        print("Python Developer:",{self.name}, "language:",{self.language}, "-")


# Object de  PythonDeveloper
dev = PythonDeveloper("Eric", "Python")
# is PythonDeveloper object an instance of a PythonDeveloper Class
print(isinstance(dev, PythonDeveloper))
# Resultat de sortis est Vrai
print(f"{dev.name},{dev.language}")
# is python_dev object an instance of a Developer Class
print(isinstance(dev, Developer))
# Resultat de sortis est Vrai
