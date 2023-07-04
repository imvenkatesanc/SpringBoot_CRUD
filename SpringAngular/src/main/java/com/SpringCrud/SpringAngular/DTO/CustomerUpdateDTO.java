package com.SpringCrud.SpringAngular.DTO;

public class CustomerUpdateDTO {
    private int cutomerid;
    private String customername;
    private String customeraddress;
    private int mobile;

    public CustomerUpdateDTO(int cutomerid, String customername, String customeraddress, int mobile) {
        this.cutomerid = cutomerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {
    }

    public int getCutomerid() {
        return cutomerid;
    }

    public void setCutomerid(int cutomerid) {
        this.cutomerid = cutomerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cutomerid=" + cutomerid +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
