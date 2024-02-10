package task4.user;

import java.util.Objects;
import java.util.Scanner;

public class User extends UserInfo{
    public static class UserBuilder {
        Scanner scanner = new Scanner(System.in);
        private User user;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder name() {
            System.out.println("Input name:");
            user.name = scanner.next();
            return this;
        }

        public UserBuilder mainJobTax() {
            System.out.println("Does this person main job taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.mainJobTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder extraJobTax() {
            System.out.println("Does this person have extra job taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.extraJobTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder rewardTax() {
            System.out.println("Does this person have reward taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.rewardTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder propertySaleTax() {
            System.out.println("Does this person have property sale taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.propertySaleTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder giftTax() {
            System.out.println("Does this person have gift taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.giftTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder foreignTransactionTax() {
            System.out.println("Does this person have foreign transaction taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.foreignTransactionTax = scanner.nextDouble();
            }
            return this;
        }

        public UserBuilder childrenTax() {
            System.out.println("Does this person have children taxes? Type 'y' if yes.");
            if(Objects.equals(scanner.next(), "y")){
                System.out.println("Input amount of money: ");
                user.childrenTax = scanner.nextDouble();
            }
            return this;
        }

        public User build() {
            return user;
        }
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mainJobTax=" + mainJobTax +
                ", extraJobTax=" + extraJobTax +
                ", rewardTax=" + rewardTax +
                ", propertySaleTax=" + propertySaleTax +
                ", giftTax=" + giftTax +
                ", foreignTransactionTax=" + foreignTransactionTax +
                ", childrenTax=" + childrenTax +
                '}';
    }
}
