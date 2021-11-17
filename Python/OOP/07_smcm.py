# Static method and class method
class Hero:
    
    __jumlah = 0
    
    def __init__(self, name):
        self.name = name
        Hero.__jumlah += 1
    # Tidak berlaku untuk objek tetapi berlaku untuk class
    def getJumlah():
        return Hero.__jumlah
    
    @staticmethod
    def getJumlah2():
        return Hero.__jumlah
    
    @classmethod
    def getJumlah3(cls):
        return cls.__jumlah

sniper = Hero("sniper")
print(sniper.getJumlah2())
reaper = Hero("reaper")
print(reaper.getJumlah2())
print(sniper.getJumlah3())