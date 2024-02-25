class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> sentenceSet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (c != ' ') {
               sentenceSet.add(c);
            }
        }
        return sentenceSet.size()==26;
    }
}
