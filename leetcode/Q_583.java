class Solution {
    
 
    public int minDistance(String word1, String word2) {
         
        //Longest common subsequence concept
     int[][]dp = new int[word1.length()+1][word2.length()+1];

        for(int i=1 ;i<=word1.length();i++){
            for(int j=1; j<=word2.length() ;j++){

                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j]  , dp[i][j-1]);
                }
            }
        }

        return (word1.length()+word2.length()) -2*dp[word1.length()][word2.length()];

    }
}
