package visitor;

public class Main {

    public static void main(String[] args) {

        NovelBook novelBook = new NovelBook("노인과바다");
        int guestPrice = novelBook.accpetPrice(new GuestVisitor());
        int memberPrice = novelBook.accpetPrice(new MemberVisitor());

        System.out.println("소설 회원가 : "+ memberPrice);
        System.out.println("소설 비회원가 : "+guestPrice );

        WorkBook workBook = new WorkBook("수리가형문제집");
        guestPrice = workBook.accpetPrice(new GuestVisitor());
        memberPrice = workBook.accpetPrice(new MemberVisitor());
            
        System.out.println("문제집 회원가 : "+ memberPrice);
        System.out.println("문제집 비회원가 : "+guestPrice );
    }
}
