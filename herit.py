class Base1(object):
        def __init__(self):
            self.str1 = "Geek1"           
          


class Base2(object):
        def __init__(self):
            self.str2 = "Geek2"
            


class Demo(Base1, Base2):
        def __init__(self):
            Base1.__init__(self)
            Base2.__init__(self)
         

        def printStrs(self):
            print(self.str1, self.str2)


ob = Demo()
ob.printStrs()
