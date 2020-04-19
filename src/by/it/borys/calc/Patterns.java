package by.it.borys.calc;

public interface Patterns {

    static final String OPERATION = "[=*/+-]";
    static final String SCALAR = "-?[0-9\\.]+";
    static final String VECTOR = "[{]((-?[0-9\\.]+)*,?)*[}]";
    static final String MATRIX = "[{]([{]((-?[0-9\\.]+)*,?)*[}],?)+[}]";
}
