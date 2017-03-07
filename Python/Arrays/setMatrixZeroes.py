class Solution:
	def setZeroes(self, A):
		row = [False]  * len(A)
		column = [False] * len(A[0])

		for i in range(0, len(A)):
			for j in range(0, len(A[i])):
				if (A[i][j] == 0):
					row[i] = True
					column[j] = True


		for i in range(0, len(row)):
			if (row[i]):
				for j in range (0, len(column)):
					A[i][j] = 0

		for i in range(0, len(column)):
			if (column[i]):
				for j in range (0, len(row)):
					A[j][i] = 0

		return A


test = Solution()
print test.setZeroes([[1,0,1],[1,1,1],[1,1,1]])

