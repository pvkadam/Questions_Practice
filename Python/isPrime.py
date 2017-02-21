from math import *

def is_prime(x):
    
    if (x <= 1):
        return False
        
    else:
        for i in range(2, (int)(sqrt(x)) + 1):
            if (x % i == 0):
                return False
        return True


