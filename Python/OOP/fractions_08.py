# Make fractions class with python 

class Fraction():
    def __init__(self, numerator, denominator):
        self.num = numerator
        self.denom = denominator
    
    def gcd(self, a, b):
        if b == 0:
            return a
        else:
            return self.gcd(b, a % b)
            
    def __str__(self):
        return str(self.num) + "/" + str(self.denom)
    
    def __add__(self, other):
        num = self.num * other.denom + self.denom * other.num
        denom = self.denom * other.denom
        return Fraction(num, denom)
    
    def __float__(self):
        return float(self.num / self.denom)
    
    def __reduce__(self):
        gcd = self.gcd(self.num, self.denom)
        return Fraction(self.num // gcd, self.denom // gcd)
    
    def __sub__(self, other):
        num = self.num * other.denom - self.denom * other.num
        denom = self.denom * other.denom
        return Fraction(num, denom)