class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        
        for(String email: emails){
            int at=email.indexOf('@');
            
            String localName=email.substring(0,at);
            String domainName=email.substring(at, email.length());
            
            if(localName.contains("+")){
                int plus=email.indexOf('+');
                localName=email.substring(0, plus);
            }
            
            localName=localName.replaceAll("\\.", "");

            set.add(localName+domainName);
        }
        
        return set.size();
    }
}