package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        Offer offer6=new Offer();
        Offer offer7=new Offer();
        offer1.SetInfo("kayseri", "özenler", "möhendis", 20000, true, false, false, true);
        offer2.SetInfo("istanbul", "hepsiburada", "QA", 25000, true, false, true, true);
        offer3.SetInfo("istanbul", "letgo", "QA", 24000, false, false, true, true);
        offer4.SetInfo("istanbul", "dolap", "SDET", 18000, false, false, true, false);
        offer5.SetInfo("uşak", "tükkan", "bekçi", 15000, false, true, false, false);
        offer6.SetInfo("USA", "google", "SDET", 45000, true, true, true, true);
        offer7.SetInfo("USA", "cydeo", "SDET", 60000, true, true, true, true);

  Offer[]myOffers={offer1,offer2,offer6,offer5,offer7,offer4,offer3};
        for (Offer myOffer : myOffers) {
            System.out.println(myOffer);
        }
        System.out.println("-------------------------------");

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("-------------------------------------");

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> p.location=="USA");
        System.out.println("localOffers = " + localOffers);
        System.out.println("------------------------------------------------");

        ArrayList<Offer>offersWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println("offersWithBenefits = " + offersWithBenefits);
    }

    public static class Account {
        public String AccountHolder;
        public int accountNumber;
        public int balance;

        public void SetInfo(String accountHolder, int accountNumber, int balance) {
            AccountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String toString() {
            return "Account{" +
                    "AccountHolder='" + AccountHolder + '\'' +
                    ", accountNumber=" + accountNumber +
                    ", balance=" + balance +
                    '}';


        }

        public void checkBalance(){
            System.out.println("available balance : "+balance);
        }

        public void deposit(int money){
            balance+=money;
            System.out.println(balance);
        }

        public void withDraw(int money){
            balance-=money;
            System.out.println(balance);
        }
    }
}
