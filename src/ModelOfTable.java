import javax.swing.table.AbstractTableModel;

public class ModelOfTable extends AbstractTableModel {
    private final Book[] book;

    private final String[] entetes = {"Titre", "Auteur","Année","Rangée","Colonne"};

    public ModelOfTable() {
        super();

       book = new Book[]{
               new Book("Harry Potter", "JK Rowlings",2000,1,2),
               new Book("Harry Potter", "JK Rowlings",2000,1,2),
        };
    }

    public int getRowCount() {
        return book.length;
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return book[rowIndex].getTitle();
            case 1:
                return book[rowIndex].getWriter();
            case 2:
                return book[rowIndex].getYear();
            case 3:
                return book[rowIndex].getRow();
            case 4:
                return book[rowIndex].getColumn();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}

