import pandas as pd 

df =pd.DataFrame([[1, 2], [4, 5], [7, 8]],
     index=['java', 'python', 'php'],
     columns=['laravel', 'android'])
print(df)     