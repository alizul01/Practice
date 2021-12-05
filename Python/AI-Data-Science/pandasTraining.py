import pandas as pd

data = {
    "Name" : ["John", "Anna", "Peter", "Linda"],
    "Location" : ["New York", "Paris", "Berlin", "London"],
    "Age" : [24, 13, 53, 33]
}

studentData = pd.DataFrame(data, index=["a", "b", "c", "d"])
print(studentData)

print(studentData.loc[["a"]])