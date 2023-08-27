package chapter23;

import java.util.concurrent.RecursiveTask;
import java.util.function.IntPredicate;

public class ForkJoinMain {


    public static void main(String... args) {


    }

    static class FilterTask extends RecursiveTask<Integer> {
        public static final int THRESHOLD = 10_000;
        private int[] values;
        private int fromIndex;
        private int toIndex;
        private IntPredicate predicate;
        public FilterTask(int[] values, int fromIndex, int toIndex, IntPredicate predicate){
            this.predicate = predicate;
            this.fromIndex = fromIndex;
            this.toIndex = toIndex;
            this.values = values;
        }
        @Override
        protected Integer compute() {

            return null;
        }

    }
}
