class Solution:
	
    def repeatedNumber(self, A):

		result = set()

		for i in A:
			if i not in result:
				result.add(i)
			else:
				return i

		return -1

test = Solution()
print test.duplicates([3,4,1,4,1])