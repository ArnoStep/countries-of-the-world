public enum Country {
    Russia("Россия", false),
    China("Китай", false),
    Australia("Австралия", false),
    Brazil("Бразилия", true),
    Germany("Германия", true),
    Japan("Япония", false);

    private final String ruName;
    private final Boolean isOpen;

    Country(final String ruName, final Boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public static Country getByRuName(final String ruName) throws NoSuchCountryException {
        Country country = null;
        for (Country c : Country.values()) {
            if (c.ruName.equals(ruName)) {
                country = c;
            }
        }

        if (country == null) {
            throw new NoSuchCountryException(ruName);
        } else {
            return country;
        }
    }

    @Override
    public String toString() {
        return "Страна [" + super.toString()
                + " (" + ruName + ")"
                + "] ";
    }

    public Boolean getOpen() {
        return isOpen;
    }
}
