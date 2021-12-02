package pt.caires.hackerrank.advanced;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {

    String userRole() default "GUEST";

    int budgetLimit() default 0;

}

class FamilyMember {

    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(final int budget, final int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(final int budget, final int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

}

public class Annotations {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            final String role = in.next();
            final int spend = in.nextInt();
            try {
                final Class annotatedClass = FamilyMember.class;
                final Method[] methods = annotatedClass.getMethods();
                for (final Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        final FamilyBudget family = method
                                .getAnnotation(FamilyBudget.class);
                        final String userRole = family.userRole();
                        final int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            if (spend <= budgetLimit) {
                                method.invoke(FamilyMember.class.newInstance(),
                                              budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }

}
