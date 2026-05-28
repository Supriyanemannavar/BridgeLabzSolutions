package EmployeeAndLineComparasion;

public class LineComparisonUC3 {
    public static void main(String[] args) {

        Double line1 = 5.6;
        Double line2 = 7.2;

        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Lines are Equal");
        }
        else if (result > 0) {
            System.out.println("Line 1 is Greater");
        }
        else {
            System.out.println("Line 2 is Greater");
        }
    }
    
}
