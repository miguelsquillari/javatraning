import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {




    private static void printUsage() {
        File cDrive = new File("C:");
        System.out.println(String.format("Total space: %.2f GB",
                (double)cDrive.getTotalSpace() /1073741824));
        System.out.println(String.format("Free space: %.2f GB",
                (double)cDrive.getFreeSpace() /1073741824));
        System.out.println(String.format("Usable space: %.2f GB",
                (double)cDrive.getUsableSpace() /1073741824));

        /*
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println(String.format("Initial memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getInit() /1073741824));
        System.out.println(String.format("Used heap memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getUsed() /1073741824));
        System.out.println(String.format("Max heap memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getMax() /1073741824));
        System.out.println(String.format("Committed memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getCommitted() /1073741824));
    */



    }

    public static double getCpuUsage() {
        OperatingSystemMXBean osMBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("CPU Usage: " + osMBean.getSystemLoadAverage() + "%");
        return osMBean.getSystemLoadAverage() * 100;
    }




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
        // 187 ╗ ╝ ╚ ╔═
        System.out.println( (char)27 + "[36m ╗ █");
        System.out.println( (char)27 + "[36m WELCOME TO JAVA TRANING.");
        System.out.println( (char)27 + "[34m ==============================================================");
        System.out.println( (char)27 + "[36m FUNCTIONS");
        System.out.println( (char)27 + "[36m GENERICS");
        System.out.println( (char)27 + "[36m OPTIONALS");
        System.out.println( (char)27 + "[36m DTO USING MAPPERS'S FUNCTIONS");
        System.out.println( (char)27 + "[34m ==============================================================");
            try {
                Thread.sleep(1000);
                double cpuUsage = getCpuUsage();
                System.out.println("CPU Usage: " + cpuUsage + "%");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        printUsage();
    }
}