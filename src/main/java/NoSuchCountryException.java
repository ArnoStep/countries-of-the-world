public final class NoSuchCountryException extends Exception {
    private final String ruName;

    public NoSuchCountryException(final String ruName) {
        this.ruName = ruName;
    }

    @Override
    public String getMessage() {
        return "Страны '" + ruName + "' не существует!" + '\n';
    }
}
