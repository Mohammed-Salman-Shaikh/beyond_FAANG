class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, w = n-k;

        int total = 0;

        for(int p : cardPoints){
            total += p;
        }
        if(w == 0){
            return total;
        }

        int window = 0;

        for(int i=0; i<w; i++){
            window += cardPoints[i];
        }
        int minWindow = window;

        for(int i=w; i<n; i++){
            window += cardPoints[i] - cardPoints[i - w];
            minWindow = Math.min(minWindow, window);
        }
        return total - minWindow;
    }
}