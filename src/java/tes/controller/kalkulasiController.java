package tes.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import tes.model.Kalkulasi;

@ManagedBean(name = "kalkulasiController")

public class kalkulasiController {
   private Kalkulasi kal = new Kalkulasi();
   private UIPanel resultPanel;
   private UIInput umurMatiInput;
   private UIInput tahunMatiInput;

   public Kalkulasi getKal() {
      return kal;
   }

   public void setKal(Kalkulasi kal) {
      this.kal = kal;
   }

   public UIPanel getResultPanel() {
      return resultPanel;
   }

   public void setResultPanel(UIPanel resultPanel) {
      this.resultPanel = resultPanel;
   }

  public UIInput getUmurMatiInput() {
    return umurMatiInput;
  }

  public void setUmurMatiInput(UIInput umurMatiInput) {
    this.umurMatiInput = umurMatiInput;
  }

  public UIInput getTahunMatiInput() {
    return tahunMatiInput;
  }

  public void setTahunMatiInput(UIInput tahunMatiInput) {
    this.tahunMatiInput = tahunMatiInput;
  }
     
   public String proses() {
      FacesContext ctx = FacesContext.getCurrentInstance();
      try {
         kal.calkulasi(kal.getUmurMati(), kal.getTahunMati());
         resultPanel.setRendered(true);
         ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Berhasil", null));
      } catch (Exception ex) {
         resultPanel.setRendered(false);
         ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null));
      }
      return null;
   }
     
}
