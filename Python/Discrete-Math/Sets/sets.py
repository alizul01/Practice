"""
Sets is an unordered collection of objects, called elements
A set is said to contain an element if the element is part of the set
then we write x∈A . 
If x is not an element of the set A, then we write x∉A.
"""

A = {-2, -1, 0, 1, 2}
print(1 in A)

for x in A:
    print(x, "is an element of A")
    
B = {x for x in A if x > 0}
print(B)

def Elements(A):
    if A == set():
        print("A is empty")
    else:
        for x in A:
            print(x, "is an element of A")

print(len(A)) # len(A) is the number of elements in A |A| = 5

print(B.issubset(A)) # B is a subset of A

# Power Set of A
A = {1, 2, 3}
print(B.issuperset(A)) # A is a superset of A

def Subset(A, B):
    for x in A:
        if x not in B:
            return False
    return True

def isEqual(A, B):
    if Subset(A, B) and Subset(B, A):
        return True
    else:
        return False
    
def main():
    A = {2, 3, 4}
    B = {2, 3, 4}
    print(isEqual(A, B))

main()