import pandas as pd


df=pd.DataFrame({"Name":["Diallo","Bah"],"Prenom":["alpha","Ramatoulaye"],
                "Profession": ["developpeur mobile", "Médecin"], "age": [27, 22],
                "telephone": [621072627, 621072627],
                "Pays": ["Guinee conakry","Dakar"]})
# df.drop(["pays","telephone"],axis=1,inplace=True)
# df.dropna(subset=["tax"],inplace=True)
# df_first_name=df["Pays"].value_counts()
df_first_name=df.groupby("age")["telephone"].sum().plot()
print(df_first_name)
