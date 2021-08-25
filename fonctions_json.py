import json
data=[
    {'name':"alfa","age":27,"enfant":None,"profession":["Engineer java","software developpeur"]}
]

with open("rama.json","w+") as json_file:
    json.dump(data,json_file)
    json_file.close()

# cette ligne permet de sérialiser les données
json_file2=json.dumps(data)
print(json_file2) 

