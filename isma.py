import pandas as pd
# from slqalchemy import create_engine
# import psycopg2 as psycopg
# engine = create_engine('postgresql://postgres:dbpass@localhost:5432/sample_db')
# india_df=str
# india_df.to_sql('sample_table',engine,if_exists='replace')
# india_df.read_slq('sample_table',engine,index_columns='respondents')
utilisateur={
        "first":["alpha ","nafiou","saidou"],
        "last":["diallo ","barry","massoud"],
        "email":["alpha@yahoo.com","nafiou@gmail.com",
        "massoud@twitter.com"]}
df = pd.DataFrame(utilisateur)
df.rename(columns={"first": 'first_name',
        'last': 'last_name', 'email': 'em_ail'}, inplace=True)
print(df.tail())
