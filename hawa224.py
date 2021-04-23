import pandas as pd
df = pd.DataFrame({'animal': ['alligator', 'bee', 'falcon', 'lion',
                   'monkey', 'parrot', 'shark', 'whale', 'zebra']})

print(df)
print("======================")
print(df.tail(3))
print("====================")
print(df.tail(-3))