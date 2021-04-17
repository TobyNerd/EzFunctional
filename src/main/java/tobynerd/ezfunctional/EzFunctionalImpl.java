package tobynerd.ezfunctional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EzFunctionalImpl implements EzFunctional {

    EzFunctionalImpl() {
    }

    @Override
    public <T> List<T> filterListByBoolean(List<T> inputList, Predicate<T> predicate) {
        return inputList.stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public <T> Set<T> filterSetByBoolean(Set<T> inputSet, Predicate<T> predicate) {
        return inputSet.stream().filter(predicate).collect(Collectors.toSet());
    }

    @Override
    public <T, R> List<R> getListByFunction(List<T> inputList, Function<T, R> function) {
        List<R> outputList = new ArrayList<>();
        for (T member : inputList) {
            outputList.add(function.apply(member));
        }
        return outputList;
    }

    @Override
    public <T, R> Set<R> getSetByFunction(Set<T> inputList, Function<T, R> function) {
        Set<R> outputList = new HashSet<>();
        for (T member : inputList) {
            outputList.add(function.apply(member));
        }
        return outputList;
    }
}
