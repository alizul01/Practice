def RemoveDuplicates(n):
    dataList = []
    for x in n:
        if x not in dataList:
            dataList.append(x)
    return dataList

def Cardinality(n):
    return len(RemoveDuplicates(n))

def main():
    duplicatedData = [1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10]
    print(Cardinality(duplicatedData))
    
main()