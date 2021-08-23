
class India():

	def capital(self):
		print("New Delhi est la capitale de l'Inde.")

	def language(self):
		print("L'hindi est la langue la plus parlée de l'Inde.")

	def type(self):
		print("L'Inde est un pays en développement.")


class USA():

	def capital(self):
		print("Washington, DC est la capitale des États-Unis.")

	def language(self):
		print("L'anglais est la langue principale des États-Unis.")

	def type(self):
		print("Les USA sont un pays developpe.")

def alpha(obj):
		obj.capital()
		obj.language()
		obj.type()


obj_ind = India()
obj_usa = USA()

alpha(obj_ind)
alpha(obj_usa)
# for country in(obj_ind,obj_usa):
#         country.capital()
#         country.language()
#         country.type()

