import pandas as pd

df = pd.DataFrame(
    [['alfa', 22],
    ['massoud commadant', 25],
    ['ramatoulaye nd', 31]],
    columns=['name', 'age'])
df.loc[df.name["name"]].head(1)
print(df)
