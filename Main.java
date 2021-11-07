class Main {
    public static void main(String[] args) {
        Kucing kucing = new Meow();
        kucing.meow();

        Bebek bebek = new Kwek();
        bebek.kwek();

        KwekAdapter kwekAdapter = new KwekAdapter(bebek);
        kwekAdapter.meow();

        MeowAdapter meowAdapter = new MeowAdapter(kucing);
        meowAdapter.kwek();
    }
}