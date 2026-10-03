package lesbiangirl;

public class Main {
    public static void main(String[] args) {
        LesbianGirl adachi = new LesbianGirl(
                "Adachi",
                17,
                "submissive"
        );

        LesbianGirl shimamura = new LesbianGirl(
                "Shimamura",
                17,
                "dominance"
        );

        String they_kiss = shimamura.kissing(adachi.getName(), shimamura.getName());
        System.out.println(they_kiss);
    }
}
