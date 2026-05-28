package EmployeeAndLineComparasion;

public class LineComparisonUC2 {
    public static void main(String[] args) {

        Double line1 = Math.sqrt(
                Math.pow((6 - 2), 2) +
                Math.pow((7 - 3), 2));

        Double line2 = Math.sqrt(
                Math.pow((5 - 1), 2) +
                Math.pow((6 - 2), 2));

        if (line1.equals(line2)) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are Not Equal");
        }
    }
    
}
