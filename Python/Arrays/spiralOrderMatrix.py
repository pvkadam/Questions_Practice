class Solution:

	def spiralOrder(self, A):

		result = []

		left = 0
		right = len(A[0]) - 1
		top = 0
		bottom = len(A) - 1


		direction = 0

		while (left <= right and top <= bottom):

			if (direction == 0):
				for i in range(left, right + 1):
					result.append(A[top][i])

				top += 1
					
			
			elif (direction == 1):
				for i in range(top, bottom + 1):
					result.append(A[i][right])

				right -=1 



			elif (direction == 2):
				for i in range(right, left - 1, -1):
					result.append(A[bottom][i])

				bottom -= 1


			elif (direction == 3):
				for i in range(bottom, top - 1, -1):
					result.append(A[i][left])

				left += 1	

			direction = (direction + 1)	% 4


		return result


test = Solution()
print test.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])





