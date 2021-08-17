people=[
    {"name":"Alpha","profession":"developpeur web et mobile", "ville":"bailobaya"},
    {"name": "Saidou", "profession": "developpeur mobile", "ville": "medina"},
    {"name": "Ramatoulaye", "profession": "Menager", "ville": "Rebeuss"}
    ]

people.sort(key=lambda person: person["name"])
print(people)
