def numPalindrome(n):
    """
    Sebuah fungsi palindrome untuk mengecek
    apakah angka n merupakan palindrome
    """
    x = str(n)
    
    if len(str(x)) <= 1:
        return True
    else:
        return x[0] is x[-1] and numPalindrome(x[1:-1])
    
print(numPalindrome(12211))
print(numPalindrome(1221))
print(numPalindrome(1222))
print(numPalindrome(1223))