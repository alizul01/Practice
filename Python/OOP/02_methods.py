class Hero:
    # class variable
    
    def __init__(self, name, health, mana, damage):
        self.name = name
        self.health = health
        self.mana = mana
        self.damage = damage
        
        def attack(self, enemy):
            enemy.health -= self.damage


