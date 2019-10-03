from niit.papa2 import Papa
class Mama:
    def __init__(self, last_name,first_name):
        self.last_name=last_name
        self._first_name = first_name
        

    def se_promener(self):
        print("je me promene avec {} ".format(self.last_name))

    def _updateSoftware(self):
        print('updating software')

    def __getFirstname(self):
        return self._first_name     


mame=Mama("Diallo","Ma")
papa = Papa(23, "Diamant")
print(mame._updateSoftware())
print(mame._Mama__getFirstname())
print(papa.manger())

