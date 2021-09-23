
import re

string = "Python est Formidable"

# chercher dans l'interval
match = re.search('\APython', string)

if match:
    print("pattern trouvez a l'interieur")
else:
    print("pattern pas trouver")


