public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;


    public Person(String pName, int pAge) {
        // 코드를 입력하세요
        name = pName;
        age = pAge;
        cashAmount = 0;
        if (pAge < 0){
            age = 12;
        }
    }

    public Person(String pName, int pAge, int pCashAmount) {
        // 코드를 입력하세요
        name = pName;
        age = pAge;
        cashAmount = pCashAmount;
        if (pAge < 0){
            age = 12;
        }
        if (pCashAmount < 0){
            cashAmount = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int nage) {
        if (age >= 0){
            nage = age;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BankAccount getAccount() {
        return account;
    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)

    // account와 account 간의 거래이므로, 첫째로 BankAccount 클래스의 transfer 메소드를 써야함.
    // 둘째로 Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
