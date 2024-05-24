public class Main {


    /**
     * +~~~~~~+~~~~~~+~~~~~~~~~~~+
     * |  fg  |  bg  |  color    |
     * +~~~~~~+~~~~~~+~~~~~~~~~~~+
     * |  30  |  40  |  black    |
     * |  31  |  41  |  red      |
     * |  32  |  42  |  green    |
     * |  33  |  43  |  yellow   |
     * |  34  |  44  |  blue     |
     * |  35  |  45  |  magenta  |
     * |  36  |  46  |  cyan     |
     * |  37  |  47  |  white    |
     * |  39  |  49  |  default  |
     * +~~~~~~+~~~~~~+~~~~~~~~~~~+
     * @param args
     */
    public static void main(String[] args) {

        System.out.println( (char)27 + "[36m WELCOME TO JAVA TRANING.");
        System.out.println( (char)27 + "[34m ==============================================================");
        System.out.println( (char)27 + "[36m FUNCTIONS");
        System.out.println( (char)27 + "[36m GENERICS");
        System.out.println( (char)27 + "[36m OPTIONALS");
        System.out.println( (char)27 + "[36m DTO USING MAPPERS'S FUNCTIONS");
        System.out.println( (char)27 + "[34m ==============================================================");
    }
}