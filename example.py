import pandas as pd
df = pd.DataFrame({'first_name': ['Alpha', 'Oumar', 'Saidou', 'Hamid'],
                'Profession': ['Engineer python', 'Engineer Java', 'Mecanicien', 'Commercant'],
                'Language programmation': ['JAVA', 'PYTHON', 'PHP', 'JS'],
                'FrameWork': ['SpringBoot', 'REACTJS', 'ANGULAR', 'LARAVEL']},
                index=[0, 1, 2, 3])
print(df.head(2))
