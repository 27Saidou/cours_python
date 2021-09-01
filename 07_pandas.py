import pandas as pd
from xlsxwriter import Workbook

df = pd.DataFrame({'Data': [10, 20, 30, 20, 15, 30, 45]})
writer = pd.ExcelWriter('pandas_simple.xlsx', engine='xlsxwriter')
df.to_excel(writer, sheet_name='Student')

writer.save()
