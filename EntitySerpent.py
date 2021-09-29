class Serpent:
    
    # constructeur de la class Serpent
    def __init__(self,name):
        self.name = name

    def change_name(self,new_name):
        """changer le nom en utilisant la méthode change_name"""
        self.name = new_name

# instance de la class
snake=Serpent("Viper")

# changer le nom en utilisant la méthode change
snake.change_name("Anaconda")  
print(snake.name)   
