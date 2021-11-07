public class KwekAdapter implements Kucing {
    private Bebek bebek;

    public KwekAdapter(Bebek bebek) {
        this.bebek = bebek;
    }

    @Override
    public void meow() {
        bebek.kwek();
    }
}