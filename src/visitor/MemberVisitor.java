package visitor;

public class MemberVisitor implements Visitor {
    @Override
    public int visit(WorkBook workBook) {
        return (int) (workBook.getPrice()*0.90);
    }

    @Override
    public int visit(NovelBook novelBook) {
        return (int) (novelBook.getPrice()*0.95);
    }
}
