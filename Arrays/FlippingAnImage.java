class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int c=image.length;
      for(int i=0; i<image.length; i++){
          for(int j=0; j<(c+1)/2; j++){
              int temp=image[i][j]^1;
              image[i][j]=image[i][c-j-1]^1;
              image[i][c-j-1]=temp;
          }      }
return image;      
      }    
}
