package by.it.verbitsky.calc;

interface Patterns {
    //для хранения паттернов регэкс
    String OPERATION = "[-+*/=]";

    String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}";
    String MATRIX = "\\{" + VECTOR + "(," + VECTOR + ")*}";

    String COMMAND_PRINTVAR = "printvar";
    String COMMAND_SORTVAR = "sortvar";
    String COMMAND_CLEAR_MEMORY = "clear";

    String EMPTY_BUFFER = "Buffer is empty";
}
