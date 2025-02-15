/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nguyen Minh
 */
public class SubjectTableModel extends AbstractTableModel {

    private String[] columnHeader = new String[]{"ID", "Subject Code", "Subject Name"};
    private List<Object[]> listRow = new ArrayList<>();

    public SubjectTableModel(List<Subject> listSubject) {
        for (Subject subject : listSubject) {
            Object[] row = new Object[]{
                subject.getId(), subject.getCode(), subject.getName()
            };
            listRow.add(row);
        }
    }

    public String[] getColumnHeader() {
        return columnHeader;
    }

    public void setColumnHeader(String[] columnHeader) {
        this.columnHeader = columnHeader;
    }

    public List<Object[]> getListRow() {
        return listRow;
    }

    public void setListRow(List<Object[]> listRow) {
        this.listRow = listRow;
    }

    @Override
    public int getRowCount() {
        return this.listRow.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnHeader.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.listRow.get(rowIndex)[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return this.listRow.get(0)[columnIndex].getClass();
    }

    @Override
    public String getColumnName(int column) {
        return this.columnHeader[column];
    }

}
