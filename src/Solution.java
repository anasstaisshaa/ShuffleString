class Solution {
    public static void main(String[] args) {
        //s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }
}
