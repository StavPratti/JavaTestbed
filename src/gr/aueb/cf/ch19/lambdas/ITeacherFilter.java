package gr.aueb.cf.ch19.lambdas;

@FunctionalInterface
public interface ITeacherFilter {
    boolean filterId(Teacher teacher);
}
