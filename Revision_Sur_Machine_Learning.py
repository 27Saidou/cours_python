import matplotlib.pyplot as plt
t=[1,2,3,4,5]
prix_poulet_bailobaya=[1,3,2,4,8]
prix_oeuf=[2,4,4,3,6]
plt.plot(t,prix_poulet_bailobaya,label="prix_poulet_bailobaya")
plt.plot(t,prix_oeuf,label="prix_oeuf")
plt.title("Prix du stock")
plt.xlabel("Temp,(s)")
plt.ylabel("Prix($)")
plt.legend()
plt.show()