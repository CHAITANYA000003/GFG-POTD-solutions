class Solution:

    # Function to check if two strings are rotations of each other or not.
    def areRotations(self, s1, s2):
        # code here
        if len(s1) != len(s2):
            return False

        t = s1 + s1
        if s2 in t:
            return True

        return False