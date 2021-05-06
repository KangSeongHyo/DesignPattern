package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
   List<Colleague> colleagueList = new ArrayList<>();

   public void addCollege(Colleague colleague){
      colleagueList.add(colleague);
   }

   protected abstract void mediate(Colleague colleague, int paid);
   protected abstract void round(String product);
   protected abstract void result();
}
