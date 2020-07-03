class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        ArrayList<Integer> res=new ArrayList<>();
        
        ArrayList<HashSet<String>> sets = new ArrayList<>();
        
        for(List<String> person: favoriteCompanies){
            HashSet<String> currSet = new HashSet<>();
            
            for(String company: person){
                currSet.add(company);
            }
            
            sets.add(currSet);
        }
        
        for(int i=0;i<favoriteCompanies.size();i++){
            boolean isSubset=false;
            
            for(int j=0;j<favoriteCompanies.size();j++){
                if(i==j){continue;}
                
                HashSet<String> set1= sets.get(i);
                HashSet<String> set2=sets.get(j);
                
                if(set2.size()>set1.size() && set2.containsAll(set1)){
                    isSubset=true;
                    break;
                }
            }
            
            if(!isSubset){res.add(i);}
        }
        
        return res;
    }
}