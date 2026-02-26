package org.surya.Standalone;

import java.util.List;

public class ProductList {
    List<String> productNames;

    public List<String> getProductNames() {
        return productNames;
    }

    public ProductList() {
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    public ProductList(List<String> productNames) {
        this.productNames = productNames;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productNames=" + productNames +
                '}';
    }
}
