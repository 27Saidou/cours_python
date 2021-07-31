import pandas as pd
data = {'Pays': ['Belgium', 'India', 'Brazil'], 'Capital': [
    'Brussels', 'New Delhi', 'Brasilia'], 'Population': ['111907', '1303021', '208476']}
df = pd.DataFrame(
    data, columns=['Pays', 'Capital', 'Population'])

print(df.head(2))
