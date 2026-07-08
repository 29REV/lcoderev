// Last updated: 7/8/2026, 9:13:46 AM
class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        List<String> path = new ArrayList<>();

        backtrack(0, s, new HashSet<>(wordDict), path, res);

        return res;
    }

    private void backtrack(int start, String s, Set<String> dict,
                           List<String> path, List<String> res) {

        if (start == s.length()) {
            res.add(String.join(" ", path));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            String word = s.substring(start, end + 1);

            if (dict.contains(word)) {

                path.add(word);

                backtrack(end + 1, s, dict, path, res);

                path.remove(path.size() - 1);
            }
        }
    }
}