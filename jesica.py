# first matrix
M1 = [[1, 1, 1],
      [1, 1, 1],
      [1, 1, 1]]

# second matrix
M2 = [[1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]]


sum = [[0, 0, 0],
       [0, 0, 0],
       [0, 0, 0]]
for i in range(len(M1)):
    for j in range(len(M2[0])):
        sum[i][j] = M1[i][j] + M2[i][j]
#afficher la matrix       
for item in sum:
    print(item)
