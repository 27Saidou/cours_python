import pandas as pd
df = pd.DataFrame({
    'brand': ['Yum Yum', 'Yum Yum', 'Indomie', 'Indomie', 'Indomie'],
    'style': ['cup', 'cup', 'cup', 'pack', 'pack'],
    'rating': [4, 4, 3.5, 15, 5]
})

print(df.drop_duplicates())


df2 = pd.DataFrame({
    'brand': ['Yum Yum', 'Yum Yum', 'Indomie', 'Indomie', 'Indomie'],
    'style': ['cup', 'cup', 'cup', 'pack', 'pack'],
    'rating': [4, 4, 3.5, 15, 5]
})
print(df2.duplicated(keep='last'))  
print(df2.drop_duplicates()) 

df3 = pd.DataFrame({'animal': ['alligator', 'bee', 'falcon', 'lion',
                'monkey', 'parrot', 'shark', 'whale', 'zebra']})
print(df3.head())
                
