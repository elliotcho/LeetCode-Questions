class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words=text.split(" ");
        String[] temp=new String[words.length];
        int k=0;
        
        
        for(int i=2;i<words.length;i++){
            if(words[i-2].equals(first) && words[i-1].equals(second)){
                temp[k]=words[i]; k++;
            }
        }
        
        String[] res=new String[k];
        k=0;
        
        for(int j=0;j<temp.length;j++){
            if(temp[j]!=null){res[k]=temp[j]; k++;}
        }
        
        
        return res;
    }
}
