/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        ArrayList<String> res=new ArrayList<>();
        res.add(startUrl);
        
        String hostName = startUrl.split("/")[2];
        
        HashSet<String> visited=new HashSet<>();
        visited.add(startUrl);
        
        LinkedList<String> queue =new LinkedList<>();
        queue.add(startUrl);
        
        while(!queue.isEmpty()){
            String currUrl =queue.remove();
            
            List<String> urls=htmlParser.getUrls(currUrl);
            
            for(String url: urls){
                if(!visited.contains(url) && url.contains(hostName)){
                    visited.add(url);
                    queue.add(url);
                    res.add(url);
                }
            }
        }
        
        return res;
    }
}