from Produit import *

def creerFic(self):
    fp=open('ListeProduit.txt','w')
    n=int(input("Entrer le nombre de produit a mettre dans le fichier"))
    for i in range(1,n+1):
        p=Produit()
        p.saisieProduit()
    info=p.getCode()+"\t"+p.getNom()+"\t"+str(p.getPrix())+"\t"+str(p.getQte())+"\t"+p.getDateFabrication()+"\t"+p.getFournisseur()+"\n"
    fp.write(info)
    fp.close()

def LireFic(self):
    fp = open('ListeProduit.txt', 'r')
    c=fp.read()
    print("Le contenu du fichier est ")
    print(c)
    fp.close()

def ajoutFic(self):
    fp=open('ListeProduit.txt', 'a')
    n=int(input("Entrer le nombre de produit a ajouter dans le fichier "))
    for i in range(1,n+1):
        p=Produit()
        p.saisieProduit()
    info = p.getCode()+"\t"+p.getNom()+"\t"+str(p.getPrix())+"\t"+str(p.getQte()) + \
        "\t"+p.getDateFabrication()+"\t"+p.getFournisseur()+"\n"
    fp.write(info)
    fp.close()

creerFic()
LireFic()