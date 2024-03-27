package Task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericMaxStack <T extends Comparable>
{
        private Stack<T> stack = new Stack<T>();
        private List<T> maxList = new ArrayList<T>();

        private T max;

        public void Push(T val)
        {
            stack.push(val);
            if(stack.size() == 1)
            {
                max = val;
            }
            if(val.compareTo(max) > 0)
            {
                max = val;
            }
            maxList.add(max);
        }

        public T pop()
        {
            if(stack.empty())
            {
                return null;
            }
            else
            {
                T temp = stack.peek();
                maxList.remove((maxList.size()-1));
                stack.pop();
                return temp;
            }
        }
        public T max()
        {
            return maxList.get(maxList.size()-1);
        }
}
