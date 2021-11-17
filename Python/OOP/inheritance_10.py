# Belajar inheritance dari class Animal

class Animal:
    def __init__ (self, name, age, weight):
        self.name = name
        self.age = age
        self.weight = weight
    def eat(self):
        print(f'{self.name} is eating')
     
    def sleep(self):
        print(f'{self.name} is sleeping')

class Cat(Animal):
    def __init__(self, name, age, weight, color):
        super().__init__(name, age, weight)
        self.color = color
    
    def purr(self):
        print(f'{self.name} is purring')

class dog(Animal):
    pass

puppy = dog('Puppy', 1, 10)
print(puppy.name)