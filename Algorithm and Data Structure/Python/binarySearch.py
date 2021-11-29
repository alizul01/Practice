# Binary Search with Python

"""
Binary Search Algorithm :
1. Masukkan data
2. Masukkan target
3. Cek data/2, apakah ada target? Jika iya maka return index, jika tidak maka cek apakah lebih besar atau kecil
4. Jika terlalu besar maka range terakhir adalah data/2, jika tidak maka range terakhir adalah data dan range awal adalah data/2
"""

def binary_search(data, target):
    start = data[0]
    end = len(data) - 1
    mid = end//2
    index = mid
    while True:
        if mid == target:
            index = data[end]
            return index
        elif mid > target:
            end = mid
        elif mid < target:
            start = mid
        elif 
                