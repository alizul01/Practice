# Statistics

import numpy as np

speed = [99, 76, 93, 85, 91, 70, 72, 88, 77, 64, 91, 95, 79, 81, 72]

x = np.mean(speed)
y = np.median(speed)
z = np.std(speed)
a = np.var(speed)

print(f"The mean speed is {x}")
print(f"The median speed is {y}")
print(f"The standard deviation is {z}")
print(f"The variance is {a}")