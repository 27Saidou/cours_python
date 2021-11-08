text = "Une application java et python"
# ecrire sur une fichier exemple
fp = open("write_demo.txt", 'w')
fp.write(text)
print('Done')
fp.close()
