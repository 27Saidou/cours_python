import sys
while True:
    try:
        user = int(input())
        if user < 0:
            raise ValueError("s'il vous plait taper un nombre entier")
        else:
            print("user input: %s" % user)
    except ValueError as e:
            sys.exit(1)
            print(e)
