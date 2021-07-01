public class MarketGood {

    //(1) String name (상품의 이름)
//(2) int retailPrice (상품의 출시 가격)
//(3) int discountRate (상품의 할인율. 단위: %)
    private String name;
    private int retailPrice;
    private int discountRate;


//(1) public MarketGood(String name, int retailPrice, int discountRate)
//생성자의 파라미터로 받은 값들을 인스턴스 변수에 지정해줍니다.
//discountRate가 0%보다 작거나 100%보다 큰 경우, 0으로 지정해줍니다.
//(2) public MarketGood(String name, int retailPrice)
//두 번째 생성자는 discountRate의 기본값으로 0을 넣어줍니다.

    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
        if (discountRate > 100 || discountRate < 0) {
            this.discountRate = 0;
        }
    }

    public int getDiscountedPrice() {
        int price = this.retailPrice * (100 - this.discountRate) / 100;
        return price;
    }


    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
