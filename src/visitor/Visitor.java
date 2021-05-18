package visitor;

public interface Visitor {
    int visit(WorkBook workBook);
    int visit(NovelBook novelBook);
}
