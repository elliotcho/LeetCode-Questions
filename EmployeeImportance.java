/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map=new HashMap<>();
        
        for(Employee e: employees){map.put(e.id, e);}
        
        return dfs(id, map);
    }
    
    public int dfs(int id, Map<Integer, Employee> map){
        int importance=map.get(id).importance;
        
        for(int sub: map.get(id).subordinates){
            importance+=dfs(sub, map);
        }
        
        return importance;
    }
}