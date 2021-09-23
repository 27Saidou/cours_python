from datetime import datetime
from datetime import date
date_string = "21 June, 2018"
date_object = datetime.strptime(date_string, "%d %B, %Y")
print(isinstance(date_object, datetime))

date_actuelle=date.today()
print(date_actuelle)
date_et_heure_act=datetime.now().time()
print(date_et_heure_act)