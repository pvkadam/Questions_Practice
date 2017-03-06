class Solution:
    # @param a : list of integers
    # @param b : integer
    # @return a list of integers
    def rotateArray(self, a, b):
        ret = []
        
        for i in xrange(len(a)):
            ret.append(a[(i + b)%len(a)])

                
        return ret


test = Solution()
result = test.rotateArray([1,2,3,4,5,6,7,8,9,10], 12)
print result



