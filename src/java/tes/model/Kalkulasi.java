package tes.model;

public class Kalkulasi {
  
   private int umurMati;
   private int tahunMati;
   private String result;

  public int getUmurMati() {
    return umurMati;
  }

  public void setUmurMati(int umurMati) {
    this.umurMati = umurMati;
  }

  public int getTahunMati() {
    return tahunMati;
  }

  public void setTahunMati(int tahunMati) {
    this.tahunMati = tahunMati;
  }

  public String getResult() {
     return result;
  }

  public void setResult(String result) {
     this.result = result;
  }

  public void clear(){
     result = "";
  }
  
  public int calkulasi(int umurMati, int tahunMati){
    int selisih = tahunMati - umurMati;
    int jumlah = 0;
    int[] isi = new int[selisih+1];
    String isinya = "";
        
    for(int c = 1; c <= selisih; c++){
      if(c <= 2)
        isi[c] = 1;
      else
        isi[c] = isi[c-2] + isi[c-1];
      jumlah += isi[c];
    }
    
    for(int c = 1; c <= selisih; c++){
      isinya = isinya + (c == 1 ? "" : " + ") + isi[c];
    }
    
    System.out.println("On the "+ selisih +" year she kills "+ isinya + " = " + jumlah + " villagers");
    System.out.println("Year of Birth = "+ tahunMati +" - "+ umurMati +" = "+ selisih +", number of people killed on year "+ selisih +" is "+ jumlah);
    
    result = "Year of Birth = "+ tahunMati +" - "+ umurMati +" = "+ selisih +", number of people killed on year "+ selisih +" is "+ jumlah;
    return jumlah;
  }
}
