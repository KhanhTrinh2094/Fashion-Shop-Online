package admin.manager;

import entities.Customers;
import entities.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.OrdersFacade;

@ManagedBean
@SessionScoped
public class DetailOrderManaged {

    @EJB
    private OrdersFacade ordersFacade;
    private List<Orders> list;

    public DetailOrderManaged() {
        if (list == null) {
            list = new ArrayList<>();
        }
    }

    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

    public String detailUser(Customers customer) {
        list = ordersFacade.getListByUserID(customer);
        if(!list.isEmpty()){
            return "DetailUserOrder";
        }
        return "";
    }

}
