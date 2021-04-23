import pandas as pd 

data=pd.read_json('D:/data.json')
print(data.to_string())