package DAY7.SESSION3;

public class UniquePaths2 {
    public static int uniquePathsWithObstacle(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1){
            return 0;
        }
        int[][]dp=new int[m][n];
        dp[0][0]=1;

        //first row
        for(int i=1;i<n;i++){
            if(grid[0][i]==0){
                dp[0][1]=0;
            }
        }
        //first column
        for(int j=1;j<m;j++){
            if(grid[j][0]==0){
                dp[j][0]=dp[j-1][0];
            }
        }
        //Remaining values
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
         int[][] grid = {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    };

    int result = uniquePathsWithObstacle(grid);

    System.out.println("Number of unique paths: " + result);
    }
    
}
