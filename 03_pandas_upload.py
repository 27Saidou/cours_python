import pandas as pd
df=pd.DataFrame({"Nom":["Diallo"],"Prenom":["alpha"],"profession":["developpeur mobile"]})

with pd.ExcelWriter('student_alfa.xlsx',
                    mode='a') as writer:
    df.to_excel(writer, sheet_name="student_alfa1")


df=pd.read_excel("student_alfa.xlsx")
print(df)   
