class Player:
    def __init__(self, pseudo, health, attack):
        self.pseudo = pseudo
        self.health = health
        self.attack = attack
        self.Weapon=None

        print(" Bienvenue au joueur", pseudo,
              "/ Point de Vie", health, "/ Attaque", attack)

    def get_pseudo(self):
        return self.pseudo

    def get_attack_value(self):
        return self.attack

    def damage(self, damage):
        self.health -= damage
        print("Aie... Vous venez de subir", damage, "Dégats")

    def attack_player(self, target_player):
        target_player.damage(self.attack)
