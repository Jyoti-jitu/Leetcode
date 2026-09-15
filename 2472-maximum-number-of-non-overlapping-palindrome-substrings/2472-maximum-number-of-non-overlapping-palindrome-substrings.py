class Solution:
    def maxPalindromes(self, s: str, k: int) -> int:
        n = len(s)

        # pal[l][r] = True if s[l:r+1] is palindrome
        pal = [[False] * n for _ in range(n)]

        # Build palindrome table
        for length in range(1, n + 1):
            for l in range(n - length + 1):
                r = l + length - 1

                if s[l] == s[r]:
                    if length <= 2:
                        pal[l][r] = True
                    else:
                        pal[l][r] = pal[l + 1][r - 1]

        # dp[i] = maximum number of palindromes
        # using the first i characters
        dp = [0] * (n + 1)

        for r in range(n):
            # Don't select anything ending at r
            dp[r + 1] = dp[r]

            for l in range(r + 1):
                length = r - l + 1

                if length >= k and pal[l][r]:
                    dp[r + 1] = max(dp[r + 1], dp[l] + 1)

        return dp[n]