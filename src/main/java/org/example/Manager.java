package org.example;



import java.util.List;


public class Manager extends Staff {
    public Manager(String name, int idNo) {
        super(name, idNo);
    }
    //The hire cashier method
    public int hireCashier(List<Staff> staff, Applicant applicant){
        int output;
        if(applicant.getAge()> 18 && applicant.getAge() < 60 && applicant.getAssessmentScore()>70 && applicant.isADegreeHolder()==true){
            Staff newCashier = new Staff(applicant.getName(),(int) ((Math.random() * (5000 - 0)) + 0));
            staff.add(newCashier);
            System.out.println("You have successfully hired " + applicant.getName() + " as a new Cashier");
            output =0;
        }else {
            System.out.println("This applicant is not qualified for this position");
            output =1;
        }
        return output;
    }
}

