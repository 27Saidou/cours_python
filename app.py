from tkinter import *
import webbrowser

def open_graven_channel():
    open_graven_channel.open_new("https://volkeno-tank.com")

window = Tk()


window.title("MY Application")
window.geometry("1080x720")
window.minsize(720,480)
window.config(background="#41B77F")
#Creation d'un frame

frame = Frame(window,bg="#41B77F")

#ajouter un premier text
label_text = Label(frame, text="Bienvenue Diamant ddans mon Appli",
                   font=("Courrier", 40), bg="#41B77F", fg="white")
label_text.pack()
#comment ajouter une second_text
label_sub_title = Label(frame, text="Hey this is Saidou", font=(
    "Courrier", 25), bg="#41B77F", fg="white")
label_sub_title.pack()
#ajouter le frame
frame.pack(expand=YES)
#ajouter un bouton 

btn_ajou = Button(frame, text="Hi stop Hacking", font=(
    "Courrier", 25), bg="white", fg="#41B77F",command=open_graven_channel)
    #afficher Button
btn_ajou.pack(pady=25,fill=X)
#afficher la fenetre
window.mainloop()
