class Personne:
    

    def __init__(self, nom):
       
        self.nom = nom
        self.prenom = "Martin"

    def __str__(self):
       
        return "{0} {1}".format(self.prenom, self.nom)


class AgentSpecial(Personne):


    def __init__(self, nom, matricule):
       
        # On appelle explicitement le constructeur de Personne :
        Personne.__init__(self, nom)
        self.matricule = matricule

    def __str__(self):
        
        return "Agent {0}, matricule {1}".format(self.nom, self.matricule)
agent=AgentSpecial("Momo","234444")
print(isinstance(agent, Personne))
