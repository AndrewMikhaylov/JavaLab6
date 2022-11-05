import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class SortingAndChoosing {
    private List list;
    public SortingAndChoosing(List list){
        this.list = list;
    }
    public void Sorting(){
        sort(list, new Comparator<Sweet>() {
            @Override
            public int compare(Sweet o1, Sweet o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public List getList() {
        return list;
    }
}


