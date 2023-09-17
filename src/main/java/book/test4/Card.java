package book.test4;

enum Card {
    HEART, CLUB, SPADE, DIAMOND;

    public boolean isRed() {
        return switch (this) {
            case HEART, DIAMOND -> true;
            default -> false;
        };
    }
}