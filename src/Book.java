public class Book {

    private String Title;
    private String Writer;
    private int Year;
    private int Row;
    private int Column;

    public Book(String Title,String Writer,int Year, int Row, int Column)
    {
        this.Title=Title;
        this.Writer=Writer;
        this.Year=Year;
        this.Row=Row;
        this.Column=Column;

    }


    public String getTitle() {
        return Title;
    }

    public String getWriter() {
        return Writer;
    }

    public int getYear() {
        return Year;
    }

    public int getRow() {
        return Row;
    }

    public int getColumn() {
        return Column;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void setRow(int row) {
        Row = row;
    }

    public void setColumn(int column) {
        Column = column;
    }
}
