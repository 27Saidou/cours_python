import datetime
from datetime import time
no= datetime.datetime.now()
print(no)
date_object = datetime.date.today()
print(date_object)

a = time(11, 34, 56)

print("heure =", a.hour)
print("minute =", a.minute)
print("second =", a.second)
print("microsecond =", a.microsecond)

