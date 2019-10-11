

#voici correction du TP que je t'ai donnée OK
age=int(input("quelle est votre age!"))
res=input("souhaitez-vous prendre du footis")
res="oui"
prix={700,800}
if age<=12:
    print("vous etes mineur{}".format(prix))
elif age>14:
    print("vous etes majeur{}".format(prix))   
elif res=="oui":
  print("Vous devez augmentez {}".format(age+200))
  age=700
  age=age+2
  
     
def prix_total_a_payer(nb_prix1,nb_prix2):
    return nb_prix1 +nb_prix2  
p=prix_total_a_payer(700,800)
print("le prix total est de :{}".format(p))  
   
