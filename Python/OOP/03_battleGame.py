import random as rd

class Hero:
    attack_terasa = 0
    
    def __init__ (self, name, health, attackpower, armor):
        self.name = name
        self.health = health
        self.attackPower = attackpower
        self.armor = armor
        
    def attack(self, enemy):
        print(self.name + " menyerang " + enemy.name)
        enemy.diserang(self, self.attackPower)
    
            
    def diserang(self, enemy, attackPower_enemy):
        print(self.name + " diserang " + enemy.name)
        if  self.armor > 0:
            attack_terasa = attackPower_enemy - self.armor
        else:
            attack_terasa = attackPower_enemy
        if attack_terasa < 0:
            attack_terasa = 0
        if bool(rd.randint(0,1) == 1):
            attack_terasa = 0
            print(self.name + " berhasil defense dari " + enemy.name)
        self.armor -= attackPower_enemy
        self.health -= attack_terasa
        print(self.name + " mendapatkan damage " + str(attack_terasa))
        print(self.name + " health saat ini " + str(self.health))
    
    def randomHealth(self):
        ranHealth = rd.randint(0,10)
        self.health += ranHealth
        print(self.name + " mendapatkan nyawa sebanyak " + str(ranHealth))
    
    def randomItems(self, confirm):
        if confirm == True:
            items = {
            0 : "health",
            1 : "Armor",
            2 : "Attack Power",
            3 : "Random Health"
        }
            
            if items[rd.randint(0, 3)] == "Armor":
                self.armor += 5
                print(self.name + " mendapatkan Armor sebanyak 5")
            elif items[rd.randint(0, 3)] == "Attack Power":
                self.attackPower += 5
                print(self.name + " mendapatkan Attack Power sebanyak 5")
            else:
                self.health += 5
                print(self.name + " mendapatkan Health sebanyak 5")

sniper = Hero("sniper", 200, 5, 40)
assassin = Hero("assassin", 50, 10, 45)
confirm = True
lucky = False

while sniper.health > 0 and assassin.health > 0 and confirm:
    print()
    sniper.attack(assassin)
    lucky = rd.randint(0,1) == 1
    sniper.randomItems(lucky)
    if sniper.health < 10 and rd.randint(0,1) == 1:
        sniper.randomHealth()
    print()
    assassin.attack(sniper)
    lucky = rd.randint(0,1) == 1
    assassin.randomItems(lucky)
    if assassin.health < 10 and rd.randint(0,1) == 1:
        assassin.randomHealth()
    print()
    
else:
    if sniper.health <= 0:
        print(assassin.name + " menang" + "dengan sisa nyawa " + str(assassin.health))
    elif assassin.health <= 0:
        print(sniper.name + " menang " + "dengan sisa nyawa " + str(sniper.health))
    elif sniper.health <= 0 and assassin.health <= 0:
        print("Keduanya kalah")
    print("Game selesai")