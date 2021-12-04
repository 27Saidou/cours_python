class Saidou_Engineer():
    def __init__(self):
        self.course="Java Programming course"
        self.__tech="java"
    
    def courseName(self):
        return self.course+self.__tech


obj=Saidou_Engineer()
print(obj.course)
print(obj._Saidou_Engineer__tech)
print(obj.courseName())