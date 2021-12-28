class Pokemon():
    def __init__(self, name, Type, health):
        self.name = name
        self.Type = Type
        self.health = health

    def attack(self):
        print("Electric attack!!.Zhoop!!!")

    def dodge(self):
        print("Pikachu Dodge!")

    def evolve(self):
        print("Evolving to Raichu!!!!")
if __name__ == "__main__":
    pk1 = Pokemon("Pikachu", "Electric", 120)
print(pk1.name,pk1.Type,pk1.health)
pk1.attack()
pk1.dodge()
pk1.evolve()