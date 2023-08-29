package com.mycompany.app.PCC.atv1.quest4;

import java.io.*;
import java.util.ArrayList;
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
  public void write(List<Disciplina> list){

  }
  public List<Disciplina> read(){
    return new ArrayList<Disciplina>();
  }
}
