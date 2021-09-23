import threading
import time


def print_hello():
  for i in range(4):
    time.sleep(0.5)
    print("Bonjour")


def print_hi():
    for i in range(4):
      time.sleep(0.7)
      print("oups!")


t1 = threading.Thread(target=print_hello)
t2 = threading.Thread(target=print_hi)
t1.start()
t2.start()
