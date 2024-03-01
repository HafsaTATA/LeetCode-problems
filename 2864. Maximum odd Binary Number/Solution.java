class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder output = new StringBuilder();
        int oneCounter = 0;
        for(char c : s.toCharArray()) {
            if (c == '1')
                oneCounter++;
        }
        //we save a '1' for the last bit so we ensure it's odd
        oneCounter--;
        for(int i = 0; i < oneCounter; i++) {
            output.append('1');
        }
        for(int i = 1; i < s.length()-oneCounter; i++) {
            output.append('0');
        }
        output.append('1');
        return output.toString();
    }
}
