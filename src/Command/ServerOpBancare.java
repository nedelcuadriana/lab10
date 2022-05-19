package Command;

import java.util.ArrayList;
import java.util.List;

public class ServerOpBancare {
    private List<OperatiuneBancara> operatiuni = new ArrayList<>();

    public void inregistrareOperatiune(OperatiuneBancara operatiuneBancara){
        operatiuni.add(operatiuneBancara);
    }

    public void efectuareOperatiuniInregistrate(){
        for(OperatiuneBancara operatiuneBancara:operatiuni) {
            operatiuni = new ArrayList<>();
            operatiuneBancara.efectuareOperatiune();

        }
    }
}
