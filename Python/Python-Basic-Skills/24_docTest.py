# Belajar DocTest (doctest)
import doctest # import module doctest

def square(x):
    """
    >>> square(2)
    4
    >>> square(3)
    9
    >>> square(-1)
    
    >>> square(0)
    0
    """
    if x < 0:
        return None
    return x * x

doctest.testmod() # doctest.testmod() akan mengeksekusi semua docstring yang ada di dalam modul   