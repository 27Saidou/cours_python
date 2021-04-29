import numpy as np
import pandas as pd
df = pd.DataFrame({"A": [1, 2, 3], "B": [4, 5, 6]})
df=df.rename(columns= {'A': 'nom', 'B': 'prenom'})
print(df.tail())


df2 = pd.DataFrame([[np.nan, 2, np.nan, 0],
                   [3, 4, np.nan, 1],
                   [np.nan, np.nan, np.nan, 5],
                   [np.nan, 3, np.nan, 4]],
                  columns=list('ABCD'))
print(df2.fillna(method='ffill'))                  
