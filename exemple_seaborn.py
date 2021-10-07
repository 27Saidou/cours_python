import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

sns.set_theme(style="darkgrid")
tips = sns.load_dataset("tips")
sns.relplot(x="total_bill", y="tip", data=tips, kind='scatter',
            size='size', palette="ch:r=-.5,l=.75",sizes=(15,200),hue='smoker')
plt.show()

