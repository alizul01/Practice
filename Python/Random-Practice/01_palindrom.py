def isPalindrome(s):
    """
    Fungsi rekursif untuk melakukan cek
    apakah string s merupakan palindrome
    """
    
    if (len(s) <= 1):
        return True
    else:
        return s[0] == s[-1] and isPalindrome(s[1:-1])

print(isPalindrome('katak'))

huruf = "katak"
print(huruf[1:-1])
huruf = "ata"
print(huruf[1:-1])