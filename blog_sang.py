import pandas as pd
from matplotlib import pyplot as plt


blog_post_detail=(10,20,30,100,150)
plt.xlabel("Analyse diabetique")
plt.ylabel("Taux de sang normal")
plt.title("Diagramme d'analyse diabétique")
plt.legend()
plt.plot(blog_post_detail)
plt.show()
