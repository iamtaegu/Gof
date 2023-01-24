package singleton_5장;

public class Triple {

    private static Triple ALPHA;
    private static Triple BETA;
    private static Triple GAMMA;

    public String name;

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {

        if(ALPHA == null) {
            ALPHA = new Triple("ALPHA");
        }
        if(BETA == null) {
            BETA = new Triple("BETA");
        }
        if(GAMMA == null) {
            GAMMA = new Triple("GAMMA");
        }

        return name == ALPHA.name ? ALPHA : name == BETA.name ? BETA : name == GAMMA.name ? GAMMA : null;
    }

}
