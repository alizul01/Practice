# Make linear search with a list of numbers
from numpy import random as rd
from numpy import sort
def linear_search(list, num):
    """
    Return index if target found, else return none
    """
    for item in range(0, len(list)):
        if list[item] == num:
            return item
    return None

def main():
    num_list = sort(rd.randint(0, 100, 100))
    num = int(input("Enter a number : "))
    index = linear_search(num_list, num)
    if index is None:
        print("Number not found")
    else:
        print("Number found at index : ", index)

main()