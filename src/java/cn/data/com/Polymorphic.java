package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 * 多态 polymorphic
 **/
public class Polymorphic {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7000),
                new StateCouncilSpecialAllowance(16666)
        };
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income : incomes){
            total = total + income.getTax();
        }
        return total;
    }
}


class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        return income * 0.1;
    }
}

class Salary extends Income {
    public Salary(double income){
        super(income);
    }
    @Override
    public double getTax(){
        if(income <= 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income  {
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return 0;
    }
}

