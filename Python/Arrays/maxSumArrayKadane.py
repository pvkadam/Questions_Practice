class Solution:

	def maxSubArray(self, A):

		maxSumUpHere = A[0]
		maxSumInTotal = A[0]

		for i in range(1, len(A)):
			maxSumUpHere = max(maxSumUpHere + A[i], A[i])
			maxSumInTotal = max(maxSumInTotal, maxSumUpHere)

		return maxSumInTotal


test = Solution()
print test.maxSumArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])

