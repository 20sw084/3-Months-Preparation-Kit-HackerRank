# LeetCode Problem 174 : Dungeon Game (Link : https://leetcode.com/problems/dungeon-game/)
class Solution:
    def calculateMinimumHP(self, dungeon):
        # Get the size of the dungeon
        rows = len(dungeon)
        cols = len(dungeon[0])
        # Create a 2D list to store the minimum health required
        x = [[float('-inf')] * cols for _ in range(rows)]
        
        def getMinimumHealth(i, j):
            # If the knight reaches the princess, return the minimum of 0 and the cell's value
            if i == rows - 1 and j == cols - 1:
                return min(0, dungeon[i][j])
            # If the result for this cell is already calculated, return it
            if x[i][j] != float('-inf'):
                return x[i][j]
            # Calculate the minimum health required when moving right and down
            right_health = float('-inf')
            down_health = float('-inf')
            
            if j + 1 < cols:
                right_health = getMinimumHealth(i, j + 1)
            if i + 1 < rows:
                down_health = getMinimumHealth(i + 1, j)
            
            # Calculate the minimum health required to reach the princess from this cell
            min_health = dungeon[i][j] + max(right_health, down_health)
            # Store the result in the x table and return it
            x[i][j] = min(0, min_health)
            return x[i][j]
        
        # Calculate the minimum initial health required to reach the princess from the starting cell
        min_initial_health = abs(getMinimumHealth(0, 0)) + 1
        return min_initial_health
