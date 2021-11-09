# Belajar Lambda Function Python

x = lambda a : a + 10
print(x(5))

y = lambda p, q: p + q
print(y(2,3))

def myfunc(n):
    return lambda a : a * n

myDouble = myfunc(2)

print(myDouble(12))

kali = lambda a, b : a * b

print(kali(19023,23))