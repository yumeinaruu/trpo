package task4.user;
import task4.exceptions.NotValidBalanceException;

import java.util.Objects;
import java.util.Scanner;

public class User extends UserInfo {
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
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.mainJobTax = scanner.nextDouble();
                    if(user.mainJobTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder extraJobTax() {
            System.out.println("Does this person have extra job taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.extraJobTax = scanner.nextDouble();
                    if(user.extraJobTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder rewardTax() {
            System.out.println("Does this person have reward taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.rewardTax = scanner.nextDouble();
                    if(user.rewardTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder propertySaleTax() {
            System.out.println("Does this person have property sale taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.propertySaleTax = scanner.nextDouble();
                    if(user.propertySaleTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder giftTax() {
            System.out.println("Does this person have gift taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.giftTax = scanner.nextDouble();
                    if(user.giftTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder foreignTransactionTax() {
            System.out.println("Does this person have foreign transaction taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.foreignTransactionTax = scanner.nextDouble();
                    if(user.foreignTransactionTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public UserBuilder childrenTax() {
            System.out.println("Does this person have children taxes? Type 'y' if yes.");
            if (Objects.equals(scanner.next(), "y")) {
                System.out.println("Input amount of money: ");
                try {
                    user.childrenTax = scanner.nextDouble();
                    if(user.childrenTax < 0){
                        throw new NotValidBalanceException();
                    }
                } catch (NotValidBalanceException e){
                    System.out.println(e);
                }
            }
            return this;
        }

        public User build() {
            return user;
        }
    }

    public String getName() {
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
