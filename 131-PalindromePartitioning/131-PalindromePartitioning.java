// Last updated: 7/8/2026, 9:13:47 AM
class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start,
                           List<String> path,
                           List<List<String>> result) {

        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            if (isPalindrome(s, start, end)) {

                path.add(s.substring(start, end + 1));

                backtrack(s, end + 1, path, result);

                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}