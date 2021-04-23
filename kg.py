import pandas as pd
data={"calories":[420,380,490],"duration": [50, 40, 45]}
alphonse=pd.DataFrame(data)
print(alphonse)
print(alphonse.loc[[0,1]])