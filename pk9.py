import pandas as  pd
import datetime
import time
data=pd.read_csv('D:/data.csv')
# print(data.to_string())
# print(data.head(10))
# print(data.info())
data.loc[7, 'Duration'] = 45
#data.dropna(inplace=True)
#data["Calories"].fillna(130,inplace=True)

#data.dropna(subset=['Date'], inplace = True)

for x in data.index:
    if data.loc[x, "Duration"] > 120:
        data.drop(x, inplace=True)
print(data.to_string())
# cette methode permet de savoir les doublons dans un fichier
print(data.duplicated())
# cette fonction permet de supprimer les doublons
print(data.drop_duplicates(inplace=True))
print(data.corr())