from math import floor, ceil

# Rounding function
print("Rounding function")

def Rounding(x):
    if int(str(x).split(".")[1]) >= 5:
        return ceil(x)
    else:
        return floor(x)
    
print(3.5, "Transform to", Rounding(3.5))
print(3.4, "Transform to", Rounding(3.4))
print(3.6, "Transform to", Rounding(3.6))
