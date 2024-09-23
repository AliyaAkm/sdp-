public class Main {
    public static void main(String[] args) {
        // Task 1: User and Email Validation
        User user = new User("Aliya", "aliyaAkm@gmail.com");
        EmailValidator validator = new EmailValidator();

        System.out.println("Single Responsibility Principle (SRP): ");
        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid.");
        } else {
            System.out.println(user.getName() + "'s email is invalid.");
        }

        // Task 2: Shape Area Calculation
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        System.out.println("Open/Closed Principle (OCP): ");
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());

        // Task 3: Bird and LSP Compliance
        System.out.println("Liskov Substitution Principle (LSP): ");
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();

        Bird penguin = new Penguin();
        penguin.eat();

        //Task 4
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();
        System.out.println("Interface Segregation Principle (ISP): ");
        humanWorker.work();

        ((Eatable) humanWorker).eat();

        robotWorker.work();


        //Task 5
        Switchable light = new Light();
        Button button = new Button(light);
        System.out.println("Dependency Inversion Principle (DIP): ");
        button.press();
        button.release();
    }
}
