import pandas as pd
from matplotlib import pyplot as plt
df = pd.DataFrame({'mass': [0.330, 4.87, 5.97],
                'radius': [2439.7, 6051.8, 6378.1]},
                index=['Mercury', 'Venus', 'Earth'])

plot = df.plot.pie(y='mass', figsize=(11, 6))
plt.show()
print(plot)
