import numpy as np
import pandas as pd
prenoms=['hawa','rama','kadiatou','tima']
age=pd.Series([25,30,35,40],index=prenoms)
taille=pd.Series([160,175,180,170],index=prenoms)
sexe=pd.Series(list('fhhf'),index=prenoms)
df=pd.DataFrame({'age':age,'taille':taille,'sexe':sexe})
# print(df.loc[df.loc[:,'age']<35])
# print(df.reset_index())
print(df.rename(columns={'index':'prenoms'}))

df2= pd.DataFrame({
    'length': [1.5, 0.5, 1.2, 0.9, 3],
    'width': [0.7, 0.2, 0.15, 0.2, 1.1]
    }, index=['pig', 'rabbit', 'duck', 'chicken', 'horse'])

df2.rename(columns={"length":"longueur","width":"largeur"})
print(df2)    
