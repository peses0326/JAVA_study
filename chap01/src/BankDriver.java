public class BankDriver {
    public static void main(String[] args) {
        //사람  선언
//        Person01_before_생성자 p1 = new Person01_before_생성자();
//        p1.setName("고라니");
//        p1.setAge(28);
//        p1.setCashAmount(300000);

        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);
        // 은행 계좌 계설
        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);


        // 두 객체의 관계 설정
        p1.setAccount(a1);
//        a1.setOwner(p1);


        // 3. p2,a2
//        Person01_before_생성자 p2 = new Person01_before_생성자();
        Person p2 = new Person("문종모", 28, 100000);
//        p2.setName("park");
//        p2.setCashAmount(100000);

        BankAccount a2 = new BankAccount(500000, p2);
//        a2.setBalance(500000);

        p2.setAccount(a2);
//        a2.setOwner(p2);

        // 4.
/*        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);


        System.out.println(p1.getAccount().getBalance());
        System.out.println(a1.getOwner().getName());

        // 테스트
        System.out.println(p1.getName() + "의 계좌 잔액: " + p1.getAccount().getBalance());*/

        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
