public class NoOfIsland {
    public static void dfs(int i ,int j,char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return ;
        }
        if( grid[i][j] =='x') {
            return ;
        }
        grid[i][j]='x';
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
    public static int numIslands(char[][] grid) {
        int noOfIslands = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    noOfIslands++;
                }
            }
        }

        return noOfIslands;
    }
    public static void main(String[] args) {
        char[][] grid = {};
        System.out.println(numIslands(grid));
    }
}
