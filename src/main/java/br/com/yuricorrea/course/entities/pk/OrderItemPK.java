package br.com.yuricorrea.course.entities.pk;

import br.com.yuricorrea.course.entities.Order;
import br.com.yuricorrea.course.entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK)) return false;

        OrderItemPK that = (OrderItemPK) o;

        if (getOrder() != null ? !getOrder().equals(that.getOrder()) : that.getOrder() != null) return false;
        return getProduct() != null ? getProduct().equals(that.getProduct()) : that.getProduct() == null;
    }

    @Override
    public int hashCode() {
        int result = getOrder() != null ? getOrder().hashCode() : 0;
        result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
        return result;
    }
}
