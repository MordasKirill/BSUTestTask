package branching;

public class Branching {

    private static boolean isTriangle(double firstAngle, double secondAngle) {
        if (firstAngle > 0 && secondAngle > 0) {
            return firstAngle + secondAngle < 180;
        }
        return false;
    }

    private static boolean isTriangleRectangular(double firstAngle, double secondAngle) {
        return  firstAngle == 90 || secondAngle == 90 || 180 - firstAngle - secondAngle == 90;
    }

    private static int calculateFunctionForTheSecondTask(int firstVariable, int secondVariable, int thirdVariable, int fourthVariable){
        int firstMin = Math.min(firstVariable, secondVariable);
        int secondMin = Math.min(thirdVariable, fourthVariable);
        int result = Math.max(firstMin, secondMin);
        return result;
    }
    private static boolean calculateFunctionForTheTaskTree(int x, int y, int x0, int y0, int x1, int y1){
        double maxOfXAndX0 = Math.max(x, x0); // Максимум из x и x0
        double minOfX0AndX1 = Math.min(x0, x1); // Минимум из x0 и x1
        double maxOfAllX = Math.max(maxOfXAndX0, x1); // Максимум всех x
        double maxOfYAndY0 = Math.max(y, y0); // Максимум из y и y0
        double minOfY0AndY1 = Math.min(y0, y1); // Минимум из y0 и y1
        double maxOfAllY = Math.max(maxOfYAndY0, y); // Максимум всех y
        return (maxOfXAndX0 - minOfX0AndX1) / (maxOfAllX - minOfX0AndX1) == (maxOfYAndY0 - minOfY0AndY1) / (maxOfAllY - minOfY0AndY1);
        }
    private static boolean calculateFunctionForTheTaskFour(int A, int B, int x, int y, int z){
        return (y <= A) && (z <= B) || (x <= A) && (z <= B) || (x <= A) && (y <= B);
    }
    private static double calculateFunctionForTheTaskFive(double variable){
        double result;
        if (variable <= 3){
            return result = Math.pow(variable, 2) - (3 * variable + 9);
        }if (variable > 3){
            return result = 1 / (Math.pow(variable, 3) + 6);
        }else return result = 0;
    }
    public static void main(String[] args) {
        //Task #1 for part 2, triangle task
        //2 random input variables introduced for the first tusk as an example
        double firstAngleTask1 = (Math.random() * 180);
        double secondAngleTask1 = (Math.random() * 180);
        boolean resultTaskIsTriangle = isTriangle(firstAngleTask1, secondAngleTask1);
        boolean resultTaskIsTriangleRectangular = isTriangleRectangular(firstAngleTask1, secondAngleTask1);
        System.out.println("This is a result of task 1 part 2: it is triangle " + resultTaskIsTriangle + " this triangle is rectangular " + resultTaskIsTriangleRectangular);

        //Task #2 for part 2, Max, min task
        //4 random input variables introduced for the first tusk as an example
        int firstVariableTask1 = (int) (Math.random() * 10);
        int secondVariableTask1 = (int) (Math.random() * 10);
        int thirdVariableTask1 = (int) (Math.random() * 10);
        int fourthVariableTask1 = (int) (Math.random() * 10);
        int resultTask2 = calculateFunctionForTheSecondTask(firstVariableTask1, secondVariableTask1, thirdVariableTask1, fourthVariableTask1);
        System.out.println("This is a result of task 2 part 2: " + resultTask2);

        //Task #3 for part 2, Are points on a straight line task
        //3 pares of random input variables introduced for the first tusk as an example
        int x1 = (int) (Math.random() * 10), y1 = (int) (Math.random() * 10);
        int x2 = (int) (Math.random() * 10), y2 = (int) (Math.random() * 10);
        int x3 = (int) (Math.random() * 10), y3 = (int) (Math.random() * 10);
        boolean resultTask3 = calculateFunctionForTheTaskTree(x1, y1, x2, y2, x3, y3);
        System.out.println("This is a result of task 3 part 2: Points are on a straight line " + resultTask3);

        //Task #4 for part 2, Will brick go trough the hole task
        //5 random input variables introduced for the first tusk as an example
        int x = (int) (Math.random() * 10), y = (int) (Math.random() * 10), z = (int) (Math.random() * 10);
        int A = (int) (Math.random() * 10), B = (int) (Math.random() * 10);
        boolean resultPart2Task4 = calculateFunctionForTheTaskFour(A, B, x, y, z);
        System.out.println("This is a result of task 4 part 2: brick will go trough " + resultPart2Task4);

        //Task #5 for part 2, Calculate function task
        //1 random input variable introduced for the first tusk as an example
        int variableTask5 = (int) (Math.random() * 10);
        double resultTask5 = calculateFunctionForTheTaskFive(variableTask5);
        System.out.println("This is a result of task 5 part 2: " + resultTask5);

    }
}

