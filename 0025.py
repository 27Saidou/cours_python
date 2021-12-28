class Car():
    def __init__(self, ndoors, nwheels, tailLight, headLight):
        self.ndoors = ndoors
        self.nwheels = nwheels
        self.tailLight = tailLight
        self.headLight = headLight


class McLaren(Car):
        def __init__(self, ndoors, nWheels, tailLight, headLight, Engine, Wheel_Drive):
            Car.__init__(self, ndoors, nWheels, tailLight, headLight)
            self.Engine = Engine
            self.Wheel_Drive = Wheel_Drive

        def Drive(self):
            print("I am driving McLaren 720S Spyder")

#Creation du premier objet de la class McLaren
mk1 = McLaren("4", "4", "Yes", "Yes", "V8", "AWD")
print(mk1.Engine)
mk1.Drive()
