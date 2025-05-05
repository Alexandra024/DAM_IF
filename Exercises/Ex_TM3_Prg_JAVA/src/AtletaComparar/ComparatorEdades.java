package Ex_TM3_Prg_JAVA.src.AtletaComparar;

import java.util.Comparator;

public class ComparatorEdades implements Comparator<AtletaComparable>{
    
    @Override
    public int compare(AtletaComparable atl1, AtletaComparable atl2){
        return Integer.compare(atl1.getAge(), atl2.getAge());
    }

    @Override
    public String toString() {
        return "ComparatorEdades []";
    }

}
