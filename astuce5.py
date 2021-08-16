def add(x,/,y,z):
    print(f'{x=} {y=} {z=}')
    return x +y+z
print(add(2,y=3,z=8))