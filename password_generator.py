import string
from tkinter import*
from random import randint,choice


def generate_password():
    password_min = 6
    password_max = 12
    all_chars = string.ascii_letters + string.punctuation +string.digits
    password = "".join(choice(all_chars) for x in range(randint(password_min, password_max)))
    password_entry.delete(0,END)
    password_entry.insert(0,password)

    
       

window=Tk()
window.title("Genreateur de mot de pass")
window.geometry("720x480")
window.iconbitmap("logo.ico")
window.config(background="#4065A4")
#creation de la frame
frame = Frame(window, bg="4065A4")

#creation d'image
width=300
height=400
image=PhotoImage(file="password_onboarding.png").zoom(35).subsample(32)
canvas = Canvas(frame, width=width, height=height, bg="#4065A4", bd=0,highlighttchickness=0)
canvas.create_image(width/2, height/2,image=image)
canvas.grid(row=0,column=0,sticky=W)
#afficher la frame
frame.pack(expand=YES)
# creation d'un sous boites
right_frame = Frame(frame, bg="4065A4")

#creation d'un title
label_title = Label(frame, text="Mot de passe", bg="#4065A4",
                     font=("Helvetica", 20), fg="white")
#creation d'un champ d'entrer input
password_entry = Entry(right_frame,bg="#4065A4",
                    font=("Helvetica", 20), fg="white")
password_entry.pack()  
#creation d'un button
btn_generate_password = Button(frame, text="Valider", bg="#4065A4",
                               font=("Helvetica", 20), fg="white", command="generate_password")
btn_generate_password.pack(fill=X)                    

#on place la sous_boite a droite de la frame                  
right_frame.grid(row=0, column=1, sticky=W)
#afficher la fentre 


#creation d'un menu
menu_bar=Menu(window)
#ajout de menu
file_menu=Menu(menu_bar,tearoff=0)
file_menu.add_command(label="Nouveau", command=generate_password)
file_menu.add_command(Label="Quitter",command=window.quit)
menu_bar.add_cascade(Label="Fichier",menu=file_menu)

window.config(menu=menu_bar)

window.mainloop()
