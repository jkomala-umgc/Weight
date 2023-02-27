public class Project1 {
    public static void main(String[] args) {
//        Weight weight1 = new Weight(100, 16);
//        Weight weight2 = new Weight(100, 16);
//        System.out.println(weight1.lessThan(weight2));
//        System.out.println(weight2.lessThan(weight1));
//
//        weight1.addTo(weight2);
//        System.out.println(weight1.toString());

    Weight weight1 = new Weight(10, 0);
    Weight weight2 = new Weight(10, 0);
    Weight weight3 = new Weight(0, 8);

    System.out.println(findMinimum(weight1, weight2, weight3).toString());
    System.out.println(findMaximum(weight1, weight2, weight3).toString());
    System.out.println(findAverage(weight1, weight2, weight3).toString());


    }

    private static Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
        if (weight1.lessThan(weight2)) {
            if (weight1.lessThan(weight3)) {
                return weight1;
            }
            else {
                return weight3;
            }
        }
        else {
            if (weight2.lessThan(weight3)) {
                return weight2;
            }
            else {
                return weight3;
            }
        }
    }

    private static Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
        if (weight1.lessThan(weight2)) {
            if (weight2.lessThan(weight3)) {
                return weight3;
            }
            else {
                return weight2;
            }
        }
        else {
            if (weight1.lessThan(weight3)) {
                return weight3;
            }
            else {
                return weight1;
            }
        }
    }

    private static Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {
        weight1.addTo(weight2);
        weight1.addTo(weight3);
        return new Weight(0, weight1.getTotalOunces()/3);
    }


}
