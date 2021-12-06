import numpy as np

data = np.array(
    [4000, 9000, 7290, 4900,
     3450, 3600, 2490, 1400, 1525]
)

def rangeData(n):
    max = 0
    min = 0
    
    for i in n:
        if i > max:
            max = i
        elif i < min:
            min = i
    return 

print(data.mean())

print(round(data.std()))
print(round(data.var()))