package homework.day7.stringTask;

public class TextLog {
    public static void textLogTask() {
        String[] textLog = {"access_log.2020.09.07 212.168.101.5 granted", "access_log.2020.09.07 212.168.101.6 denied", "access_log.2020.09.07 212.168.101.6 denied", "access_log.2020.09.07 212.168.122.6 denied" };
        for (String parts : textLog) {
            String[] ip = parts.split(" ");
            String printIp = ip[1];
            String status = ip[2];
            if (ip[2].equals("denied")) {
                status = "failed";
            }
            if (ip[2].equals("granted")) {
                status = "ok";
            }
            System.out.println("ip " + printIp + ": " + status);
        }
    }
}