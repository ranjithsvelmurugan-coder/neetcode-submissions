class Solution {

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        // convert array to list so we can remove elements
        List<String> words = new ArrayList<>(Arrays.asList(strs));

        while (!words.isEmpty()) {

            String base = words.get(0);
            List<String> group = new ArrayList<>();
            group.add(base);
            words.remove(0);

            // check remaining words
            for (int i = 0; i < words.size(); ) {
                if (checkAnagram(base, words.get(i))) {
                    group.add(words.get(i));
                    words.remove(i);   // remove matched anagram
                } else {
                    i++; // move forward only if not removed
                }
            }

            result.add(group);
        }

        return result;
    }
}
