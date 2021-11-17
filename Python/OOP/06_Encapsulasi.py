# Encapsulasi Python
"""
Tujuan dari encapsulasi adalah untuk menghindari akses ke seluruh atribut
supaya tidak dapat diakses oleh class lain.
"""

class Hero:
    def __init__ (self, name, health, attackpower, armor):
        self.__name = name
        self.__health = health
        self.__attPower = attackpower
        self.__armor = armor
    # Getter
    def getName(self):
        return self.__name
    def getHealth(self):
        return self.__health
    # Setter
    
    def diserang(self, attackPower):
        self.__health -= attackPower
        print(self.__name + " mendapatkan serangan dari musuh")
    
    def setAttPower(self, attPow):
        self.__attPower = attPow
# Awal dari game
earthling = Hero("Earthling", 100, 10, 5)
earthling.diserang(10)