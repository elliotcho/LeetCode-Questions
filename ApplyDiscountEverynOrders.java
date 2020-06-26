class Cashier {
    int customerCount=0;
    
    int n;
    int discount;
    
    HashMap<Integer, Integer> map;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n=n;
        this.discount=discount;
        
        map=new HashMap<>();
        
        for(int i=0;i<products.length;i++){
            map.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        customerCount++;
        
        double total=0;
        
        for(int i=0;i<product.length;i++){
            total+=map.get(product[i])*amount[i];
        }
        
        return (customerCount%n ==0) ? total-(discount*total)/100: total;
    }
}
/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */