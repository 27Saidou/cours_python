import matplotlib.pyplot as plt
import numpy as np
activities=['Java','Python','C','C++']
slices=[3,7,8,6]
colors=['r','g','b','y']
fig = plt.figure(figsize=(10, 7))
plt.pie(slices,labels=activities,radius=1.2,
        startangle=90,colors=colors,
        shadow=True,autopct='%1.1f%%',
        explode=(0,0,0.1,0))
plt.title('Analyse statistics des languages de programmation')
plt.legend()
plt.show()

