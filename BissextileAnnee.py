def bissextileAnnee(annee):
    bissextile =False
    if (annee%400) or(annee%4 and annee%100!=0):
        bissextile = True
    if(bissextile):
        print("L'Annee{0} est bissextile".format(annee))
    else:
        print("L'Annee{0}  n'est pas bissextile".format(annee))
        
bissextileAnnee(12)        