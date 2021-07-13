import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([1, 2, 6, 8])
ypoints = np.array([3, 8, 1, 10])
plt.xlabel('courbe de vaccination des enfants  a bantignel')
plt.ylabel("taux de vacciner")
plt.title("Vaccination pour la Rougéole")
plt.plot(xpoints, ypoints)
plt.show()
