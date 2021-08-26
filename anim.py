from abc import ABC, abstractmethod


class Anim(ABC):
    @abstractmethod
    def faire_quelque_chose(self, action):
        pass
    
class Lion(Anim):
    def faire_quelque_chose(self, action, time):
        print(f"{action} le lion à {time}")


class Panda(Anim):
    def faire_quelque_chose(self, action, time):
        print(f"{action} le panda à {time}")


class Singe(Anim):
    def faire_quelque_chose(self, action, time):
        print(f"{action} le singe à {time}")
        

zoo = [Lion(), Panda(), Singe()]
for i in zoo:
    i.faire_quelque_chose(action="nourrir", time="10h00")

