import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('D:/data.csv')
df.drop_duplicates(inplace=True)
df.plot()
print(plt.show())
