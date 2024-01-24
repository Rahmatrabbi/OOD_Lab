public class ProxyWareHouse implements IWarehouse {

    private RealWareHouse realWarehouse;



    @Override
    public int addProduct(String productName) {
        if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }

        return realWarehouse.addProduct(productName);
    }

    @Override
    public void updateProduct(int productID, String newProductName) {
        if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }
        realWarehouse.updateProduct(productID, newProductName);
    }

    @Override
    public void deleteProduct(int productID) {
                if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }
        realWarehouse.deleteProduct(productID);
    }

    @Override
    public String getProduct(int productID) {
        if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }
        return realWarehouse.getProduct(productID);
    }

    @Override
    public void addStock(int productID, int quantity) {
                if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }
        realWarehouse.addStock(productID, quantity);
    }

    @Override
    public void deliverProduct(int productID, int quantity) {
                if(realWarehouse == null) {
            realWarehouse = new RealWareHouse();
        }
        realWarehouse.deliverProduct(productID, quantity);
    }
    
    
}