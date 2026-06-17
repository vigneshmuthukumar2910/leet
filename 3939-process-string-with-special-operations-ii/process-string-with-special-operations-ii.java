class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] lengths = new long[n];
        long currLen = 0;

        // Step 1: Forward pass to precompute lengths at each character index
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                currLen++;
            } else if (c == '*') {
                if (currLen > 0) currLen--;
            } else if (c == '#') {
                currLen *= 2;
            }
            // '%' modifies order but keeps total length identical
            lengths[i] = currLen;
        }

        // Return '.' immediately if k is entirely out of bounds
        if (k < 0 || k >= currLen) {
            return '.';
        }

        // Step 2: Backward pass to mathematically trace index k down to its origin
        long currK = k;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long prevLen = (i == 0) ? 0 : lengths[i - 1];

            if (c == '%') {
                if (prevLen > 0) {
                    currK = prevLen - 1 - currK; // Flip index position
                }
            } else if (c == '#') {
                if (currK >= prevLen) {
                    currK %= prevLen; // Map index back into original block
                }
            } else if (c == '*') {
                // Skips tracking because deleted items do not shift prior valid indices
                continue;
            } else {
                // If the pointer points directly to the newly appended lowercase letter
                if (currK == prevLen) {
                    return c;
                }
            }
        }

        return '.';
    }
}
