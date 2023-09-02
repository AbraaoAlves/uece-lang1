package com.mycompany.app.PCC.atv1.quest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DisciplinaIO {
  String filename;
  
  public DisciplinaIO(String file){
    this.filename = file;
    createIfNoExist(file);
  }

  private void createIfNoExist(String file){
    if (!new File(this.filename).exists()) {
      
      try {
        write(new ArrayList<Disciplina>());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void appendWrite(List<Disciplina> list) throws IOException, ClassNotFoundException{
    List<Disciplina> old = new ArrayList<Disciplina>(this.read());  
    old.addAll(list);

    this.write(old);
  }

  public void write(List<Disciplina> list) throws IOException {    
    FileOutputStream file = new FileOutputStream(this.filename);
    ObjectOutputStream dos = new ObjectOutputStream(file);

    dos.writeObject(list);    
  }

  public List<Disciplina> read() throws IOException, ClassNotFoundException {    
    FileInputStream file = new FileInputStream(this.filename);
    ObjectInputStream fis = new ObjectInputStream(file);

    Object obj = fis.readObject();
    
    if (obj == null) {
      return new ArrayList<Disciplina>();
    }

    return convertObjectToList(obj);   
  }

  private static List<Disciplina> convertObjectToList(Object obj) {
    List<Disciplina> list = new ArrayList<Disciplina>();
    if (obj.getClass().isArray()) {
      list = Arrays.asList((Disciplina[])obj);
    } else if (obj instanceof Collection) {
      list = new ArrayList<Disciplina>((Collection<Disciplina>)obj);
    }
    return list;
  }
}
