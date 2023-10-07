package springapppackGroupID;

public enum Genre {
    RAP("yo"), ROCK("argh");
    private final String slang;

    Genre(String slang) {
        this.slang = slang;
    }

    public String getSlang() {
        return this.slang;
    }
}
