# Python Operators

a = 10
b = 20

print(a + b)  # Addition Operator
print(a - b)  # Subtraction Operator
print(a * b)  # Multiplication Operator
print(a / b)  # Division Operator
print(a % b)  # Modulus Operator
print(a ** b)  # Exponent Operator
print(a // b)  # Floor Division Operator

# Python Assignment Operators
a = 40  # Assign 10 to variable a
print(a)
a = 40
a += 20  # Add 20 to variable a and assign the result to a (a = a + 20)
print(a)
a -= 20  # Subtract 20 from variable a and assign the result to a (a = a - 20)
print(a)
a *= 20  # Multiply 20 to variable a and assign the result to a (a = a * 20)
print(a)
a /= 20  # Divide 20 to variable a and assign the result to a (a = a / 20)
print(a)
a %= 20  # Modulus 20 to variable a and assign the result to a (a = a % 20)
print(a)
a = 40
a **= 5  # Exponent 5 to variable a and assign the result to a (a = a ** 5)
print(a)
# Floor Division 5 to variable a and assign the result to a (a = a // 5)
a //= 5
print(a)
a = 40
a = 10
# Right Shift 3 bits of variable a and assign the result to a (a = a >> 3)
a >>= 3
print(a)

# Python Logical Operators
a = 10
b = 20
print(a > b)  # Greater than Operator
print(a < b)  # Less than Operator
print(a == b)  # Equal to Operator
print(a != b)  # Not equal to Operator
print(a >= b)  # Greater than or equal to Operator
print(a <= b)  # Less than or equal to Operator

print(a and b)  # Logical AND Operator
print(a or b)  # Logical OR Operator
print(not a)  # Logical NOT Operator

print("Bitwise Operators")
# Python Bitwise Operators
a = 10
b = 20
print(a & b)  # Bitwise AND Operator
print(a | b)  # Bitwise OR Operator
print(a ^ b)  # Bitwise XOR Operator
print(~a)  # Bitwise NOT Operator

# Python Identity Operators
print("Python Identity Operators")
a = 10
b = 20
print(a is b)  # Identity Operator
print(a is not b)  # Identity Operator

# Python Membership Operators
print("Python Membership Operators")
a = 10
b = 20
list = [10, 30, 20, 40, 50]
print(a in list)  # Membership Operator
print(b not in list)  # Membership Operator
