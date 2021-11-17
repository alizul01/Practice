class Hero:
    
    def __init__(self, name, attack, defense, health):
        # instance variables
        self.name = name
        self.attack = attack
        self.defense = defense
        self.health = health


hero1 = Hero("Sniper", 100, 10, 4)
hero2 = Hero("Sven", 300, 250, 1000)
hero3 = Hero("Ucup", 1000, 5, 10)

print(hero1.__dict__)
print(hero2.__dict__)
print(hero3.__dict__)

print(Hero.__dict__)
