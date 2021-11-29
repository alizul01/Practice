import matplotlib.pyplot as plt
import numpy as np

x = np.array([-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5])
y = np.array([-2.884499141, -2.466212074,
-2,
-1.44224957,
0,
1,
0,
-1.44224957,
-2,
-2.466212074,
-2.884499141
])

plt.plot(x, y, 'r')
plt.xlabel('x')
plt.ylabel('y')
plt.title('Tugas 1')
plt.show()