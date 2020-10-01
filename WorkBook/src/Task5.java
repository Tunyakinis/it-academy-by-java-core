public class Task5 {
    public static void main(String[] args) {
        int variable = 36000;
        int weeks = variable / 604800;
        int days = variable % 604800 / 86400;
        int hours = variable % 604800 % 86400 / 3600;
        int minutes = variable % 604800 % 86400 % 3600 / 60;
        int seconds = variable % 604800 % 86400 % 3600 % 60;
        System.out.println(weeks + " weeks " + days + " days " + hours + " hours : " + minutes + " minutes : " + seconds + " seconds ");
    }
}
