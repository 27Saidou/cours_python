import json
# Déserialiser les données
with open("rama.json", "r") as rf:
    des = json.load(rf)

print(des)

