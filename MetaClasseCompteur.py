class MetaclasseCompteur(type):
    """Une méta-classe pour aider à compter les instances créées."""

    def __init__(cls, *args, **kwargs):
        super().__init__(*args, **kwargs)
        cls._nb_instances = 0

    @property
    def nb_instances(cls):
        return cls._nb_instances

    def plus_une_instance(cls):
        cls._nb_instances += 1


class MaClasse(metaclass=MetaclasseCompteur):

    def __init__(self):
        MaClasse.plus_une_instance()
        

m1 = MaClasse()
m2 = MaClasse()
m3 = MaClasse()
print(MaClasse.nb_instances)
print(type(m1).mro())
