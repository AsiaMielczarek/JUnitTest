package workshop.test.exercises;

import workshop.test.exercises.services.MathService;

public class MathApp {

    private MathService mathService;

    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    public int multiply(int a, int b){
        return a + mathService.multiply(a, b);
    }
}
