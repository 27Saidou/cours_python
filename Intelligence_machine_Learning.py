import matplotlib.pyplot as plt
import numpy as np
activities=['Java','Python','JavaScript','C#']
slices = [16.29, 33.18, 7.25, 6.97]
colors=['r','g','b','y']
fig = plt.figure(figsize=(10, 7))
plt.pie(slices,labels=activities,radius=1.2,
        startangle=90,colors=colors,
        shadow=True,autopct='%1.1f%%',
        explode=(0,0,0.1,0))
plt.title('Classement des meilleurs langages de programmation 2021')
plt.legend()
plt.show()

