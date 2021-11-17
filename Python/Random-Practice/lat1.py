def m(x):
    z = []
    for y in x:
        print(y%2)
        if y % 2:
            z += [y]
    return sum(z)

print(m([1,2,3,4,5,6,7,8,9,10]))
print([1, 2] + [3, 4])