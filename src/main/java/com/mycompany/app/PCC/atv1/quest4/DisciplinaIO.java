package com.mycompany.app.PCC.atv1.quest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DisciplinaIO {
  String file;
  InputStream inputStream;
  OutputStream outputStream;
  
  public DisciplinaIO(String file){
    this.file = file;
    initStreams(file);
  }
  private void initStreams(String file) {
    try {
      this.inputStream = new FileInputStream(file);
      this.outputStream = new FileOutputStream(file);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void appendWrite(List<Disciplina> list) throws IOException, ClassNotFoundException{
    List<Disciplina> old = new ArrayList<Disciplina>(this.read());  
    old.addAll(list);

    this.write(old);
  }


  public void write(List<Disciplina> list) throws IOException{    
    ObjectOutputStream dos = new ObjectOutputStream(this.outputStream);

    dos.writeObject(list);    
    dos.close();
  }

  public List<Disciplina> read() throws IOException, ClassNotFoundException {    
    ObjectInputStream fis = new ObjectInputStream(this.inputStream);
    List<Disciplina> result = convertObjectToList(fis.readObject());

    return result;   
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
