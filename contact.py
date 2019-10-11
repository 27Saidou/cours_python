import pickle,sys
from volkeno.bakeli.contact2 import Contact
listContact = []
while True:
    reponse = eval(input("Votre choix"))
    if reponse==1:
        nom=input("votre nom")
    
        prenom = input("votre prenom")
    
        numero = (input("votre numero"))
    
        email = input("votre email")
        
        contact=Contact(nom,prenom,numero,email)
        listContact.append(contact)
        with open('contact.txt', 'wb') as file:
            pickle.dump(listContact,file)
            file.close()
    elif reponse==2:
        with open('contact.txt', 'rb') as file:
            listContact=pickle.load(file)
            print("il y a un contact{}".format(len(listContact)))
            for contact in listContact:
                print(contact)
            file.close()

    elif reponse==4:
        sys.exit()

if __name__=="__main__":
    listContact=[]        

