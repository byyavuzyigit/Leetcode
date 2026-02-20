class Solution(object):
    def minimumPerimeter(self, neededApples):
        """
        :type neededApples: int
        :rtype: int
        """

        radius = 0
        calculatedApples = 0

        while calculatedApples < neededApples:
            radius += 1
            # each square of a radius contains 12*(radius)^2 apples
            calculatedApples += 12 * (radius ** 2)

        return 8 * radius
        