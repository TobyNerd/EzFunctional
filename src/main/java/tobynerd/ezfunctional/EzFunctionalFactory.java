package tobynerd.ezfunctional;

public final class EzFunctionalFactory {

    private EzFunctionalFactory() {
    }

    /**
     * @return an instance of {@link EzFunctional}
     */
    public static EzFunctional createEzFunctional() {
        return new EzFunctionalImpl();
    }
}
