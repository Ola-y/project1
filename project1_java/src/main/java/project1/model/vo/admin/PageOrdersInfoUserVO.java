package project1.model.vo.admin;

/**
 * 后台管理系统分页显示订单每个订单中用户信息
 * @param
 * @return
 */
public class PageOrdersInfoUserVO {

    private  String nickname;

    private  String name;

    private  String address;

    private  String phone;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
