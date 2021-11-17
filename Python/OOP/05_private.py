class Hero:
    # Class Variable
    jumlah = 0
    __privJumlah = 0
    
    # Constructor
    def __init__(self, name, health):
        self.name = name
        self.health = health
        
        # Variable Instance (Private)
        self.__private = "Private"
        # Variable Instance Protected
        self._protected = "Protected"
    
lina = Hero("Lina", 100)
darling = Hero("Darling", 200)

print(lina.__dict__)
print(Hero.__dict__)
print(Hero.jumlah)
print(Hero.__privJumlah)