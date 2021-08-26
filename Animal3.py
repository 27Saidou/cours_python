from abc import ABC, abstractmethod


class Animal3(ABC):
    @property
    def alimentation(self):
        return self._aliment

    @alimentation.setter
    def alimentation(self, aliment):
        if aliment in self.diet:
            self._aliment = aliment
        else:
            raise ValueError(f"Cet animal ne mange de carottes {_aliment}.")

    @property
    @abstractmethod
    def diet(self):
        pass

    @abstractmethod
    def nourrir(self, time):
        pass


class Lion(Animal3):
    @property
    def diet(self):
        return ["cheval", "gazelle", "buffle"]

    def nourrir(self, time):
        print(f"Le lion mange de la viande de {self._aliment} à {time}")


class Serpent(Animal3):
    @property
    def diet(self):
        return ["grenouille", "lapin"]

    def nourrir(self, time):
        print(f"Le serpent mange de la viande de {self._aliment} à {time}")


leo = Lion()
leo.alimentation = "buffle"
leo.nourrir("12h00")
jo = Serpent()
jo.alimentation = "grenouille"
jo.nourrir("12h20")
