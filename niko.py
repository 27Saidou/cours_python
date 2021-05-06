import matplotlib.pyplot as plt
import numpy as np
np.random.seed(10**7)
n_bins = 20
x = np.random.randn(10000, 3)
    
colors = ['green', 'blue', 'lime']

plt.hist(x, n_bins, density = True, 
        histtype ='bar',
        color = colors,
        label = colors)

plt.legend(prop ={'size': 10})

plt.title(' Example hopital hamdallaye\n\n',
        fontweight ="bold")

plt.show()