class Etudiant:
    def __init__(self, name,roll_no, age):
        self.name = name
        self.__roll_no = roll_no
        self.__age = age

    def show(self):
        print(f"name={self.name},roll_no= {self.__roll_no},Age= {self.__age}")
    
    def get_roll_no(self):
        return self.__roll_no

    def set_roll_no(self,number):
        if number > 50:
            print('Invalid roll no.Entrez un code correct')
        else:
            self.__roll_no = number

e1=Etudiant("Alfa",10,15)
e1.show()
e1.set_roll_no(120)
e1.set_roll_no(25)
e1.show()

