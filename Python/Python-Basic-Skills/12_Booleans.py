def bool1():
    # Python Boolean
    print("Python Boolean")
    print("True and False")
    print(True and False)  # False
    print("True or False")
    print(True or False)  # True
    print("not True")
    print(not True)  # False
    print("not False")
    print(not False)  # True
    print("True and True")
    print(True and True)  # True
    print("False and True")
    print(False and True)  # False
    print("True or True")
    print(True or True)  # True
    print("False or True")
    print(False or True)  # True


def value():
    # Python Value
    print("Python Value")
    print(10 > 9)  # True
    print(10 < 9)  # False
    print(10 == 9)  # False
    print(10 != 9)  # True
    print(10 >= 9)  # True
    print(10 <= 9)  # False


bool1()  # Python Boolean
print()  # Blank Line
value()  # Boolean Value

bool(False)  # False
bool(True)  # True
bool(0)  # False
bool(1)  # True
bool(0.0)  # False
bool(1.0)  # True
bool(0.0 + 0.0j)  # False
bool(1.0 + 1.0j)  # True
bool("")  # False
bool("False")  # True
bool("True")  # True
bool(())  # False
bool([])  # False
bool({})  # False

"""
Kalo mau ngecek apakah suatu nilai boolean, kita bisa menggunakan fungsi bool()
kalo misal nilai boolean True, maka fungsi bool() akan mengembalikan True
kalo misal nilai boolean False, maka fungsi bool() akan mengembalikan False
tapi, kalo nilai boolean yang kita cek adalah 0, maka fungsi bool() akan mengembalikan False
karena 0 adalah False
"""
print("\nMyClass")


class MyClass:
    def __len__(self):
        return 0


myObj = MyClass()
print(bool(myObj))  # False

print("\nMy Function")


def myFunction():
    return True


print(myFunction())  # True

if myFunction():
    print("My Function is True")
else:
    print("My Function is False")

print("\nisinstance")
x = 200
print(isinstance(x, str))  # False
print(isinstance(x, int))  # True
