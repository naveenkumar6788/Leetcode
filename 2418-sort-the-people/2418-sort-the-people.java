class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int tempheight=heights[i];
                    heights[i]=heights[j];
                    heights[j]=tempheight;

                    String tempname=names[i];
                    names[i]=names[j];
                    names[j]=tempname;
                }
            }
        }
        return names;
    }
}