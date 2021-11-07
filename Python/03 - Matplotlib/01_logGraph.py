import matplotlib.pyplot as plt
import numpy as np
import math

xpoints = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9])
ypoints = np.array([math.log(i, 2) for i in xpoints if i > 0])

plt.plot(xpoints, ypoints)
plt.show()