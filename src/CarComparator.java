import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car s1, Car s2) {

        if (s1.getCondition().equals(s2.getCondition())){
            return 0;
        }   else if ((s1.getCondition().equals(Condition.BAD) && s2.getCondition().equals(Condition.GOOD))  ||
                    (s1.getCondition().equals(Condition.UNUSABLE) && s2.getCondition().equals(Condition.GOOD)) ||
                    (s1.getCondition().equals(Condition.UNUSABLE) && s2.getCondition().equals(Condition.BAD))) {
            return -1;
            }

        return 1;

    }
}