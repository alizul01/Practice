# Binary Search with Python
import numpy as np

"""
Binary Search Algorithm :
1. Masukkan data
2. Masukkan target
3. Cek data/2, apakah ada target? Jika iya maka return index, jika tidak maka cek apakah lebih besar atau kecil
4. Jika terlalu besar maka range terakhir adalah data/2, jika tidak maka range terakhir adalah data dan range awal adalah data/2
"""

global countBin
countBin = 0
def binarySearch(data, target):
    low = 0
    counter = 0
    high = len(data) - 1
    while low <= high:
        mid = (low + high) // 2
        if target == data[mid]:
            return "Target {} found at index {}".format(target,mid) + " with {} attempt".format(counter)
        elif target < data[mid]:
            high = mid - 1
        elif target > data[mid]:
            low = mid + 1
        counter += 1
    return "Target {} not found with {} attempt".format(target, counter)    

def recursiveBinarySearch(data, target, low, high):
    global countBin
    mid = (low + high) // 2
    if low > high:
        return "Target {} not found".format(target) + " with {} attempt".format(countBin)
    elif data[mid] == target:
        return "Target {} found at index {}".format(target, mid) + " with {} attempt".format(countBin)
    elif data[mid] > target:
        countBin += 1
        return recursiveBinarySearch(data, target, low, mid - 1)
    else:
        countBin += 1
        return recursiveBinarySearch(data, target, mid + 1, high)

def main():
    dataSet = np.array(list(set(np.random.randint(1,1000,1000))))
    dataSet = sorted(dataSet)
    
    targetData = int(input("Masukkan angka untuk dicari : "))
    
    print(binarySearch(dataSet, targetData))
    print(recursiveBinarySearch(dataSet, targetData, 0, len(dataSet) - 1))
main()