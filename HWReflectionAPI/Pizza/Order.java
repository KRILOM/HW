package Pizza;

public class Order {
    String foodName;
    String ClientId;

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public Order(String foodName, String ClientId) {
        this.foodName = foodName;
        this.ClientId = ClientId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

}
