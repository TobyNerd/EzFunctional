package tobynerd.ezfunctional;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A collection of {@link List} and {@link Set} methods accepting anonymous functions by utilizing Java functional interfaces.
 */
public interface EzFunctional {

    /**
     * Returns a new {@link List} filtered by the predicate boolean-valued function.
     *
     * @param inputList the {@link List} to be filtered.
     * @param predicate the {@link Predicate} boolean-valued function.
     * @param <T>       Type of inputList and type of predicate boolean-valued function input argument.
     * @return new {@link List} filtered by predicate.
     */
    <T> List<T> filterListByBoolean(List<T> inputList, Predicate<T> predicate);

    /**
     * Returns a new {@link Set} filtered by the predicate boolean-valued function.
     *
     * @param inputSet  the {@link Set} to be filtered.
     * @param predicate the {@link Predicate} boolean-valued function.
     * @param <T>       Type of inputList and type of predicate boolean-valued function input argument.
     * @return new {@link Set} filtered by predicate.
     */
    <T> Set<T> filterSetByBoolean(Set<T> inputSet, Predicate<T> predicate);

    /**
     * Returns a new {@link List} with the applied function to each member.
     *
     * @param inputList the {@link List} to be filtered.
     * @param function  the {@link Function} function argument.
     * @param <T>       Type of inputList and type of function input argument.
     * @param <R>       Type of outputList and type of function output argument.
     * @return new {@link List} applied by function.
     */
    <T, R> List<R> getListByFunction(List<T> inputList, Function<T, R> function);

    /**
     * Returns a new {@link Set} with the applied function to each member.
     *
     * @param inputSet the {@link Set} to be filtered.
     * @param function the {@link Function} function argument.
     * @param <T>      Type of inputSet and type of function input argument.
     * @param <R>      Type of outputSet and type of function output argument.
     * @return new {@link Set} applied by function.
     */
    <T, R> Set<R> getSetByFunction(Set<T> inputSet, Function<T, R> function);
}
