/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_utils;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Nguyen Minh
 */
public class MyObjectOutputStream extends ObjectOutputStream{

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MyObjectOutputStream() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        return;
    }
    
    
    
}
