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
 * @author ASUS
 */
public class studentSubjectTableModel extends AbstractTableModel {

    String[] columnHeader = new String[]{"ID", "Subject Code", "Subject Name", "Status", "GPA"};
    List<Object[]> listrow = new ArrayList<Object[]>();

    public studentSubjectTableModel(List<Subject> subjectList) {
        if (subjectList.size() != 0) {
            for (Subject each : subjectList) {
                Object[] row = new Object[]{each.getId(), each.getCode(), each.getName(), each.getStatus(), each.getGPA()};
                listrow.add(row);
            }
        }

    }

    @Override
    public int getRowCount() {
        return listrow.size();
    }

    @Override
    public int getColumnCount() {
        return columnHeader.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listrow.get(rowIndex)[columnIndex];
    }

    public String[] getColumnHeader() {
        return columnHeader;
    }

    public void setColumnHeader(String[] columnHeader) {
        this.columnHeader = columnHeader;
    }

    public List<Object[]> getListRow() {
        return listrow;
    }

    public void setListRow(List<Object[]> listRow) {
        this.listrow = listRow;
    }

    public Class<?> getColumnClass(int columnIndex) {
        return this.listrow.get(0)[columnIndex].getClass();
    }

    @Override
    public String getColumnName(int column) {
        return this.columnHeader[column];
    }

}
