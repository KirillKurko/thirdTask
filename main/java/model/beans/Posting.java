package model.beans;

import java.util.Calendar;

public class Posting {

    private String matDoc;
    private int item;
    private Calendar docDate;
    private Calendar pstngDate;
    private String materialDescription;
    private int quantity;
    private String bun;
    private double amountLC;
    private String crcy;
    private String userName;
    private boolean isAuthorized;

    public Posting() {
    }

    public Posting(String matDoc,
                   int item,
                   Calendar docDate,
                   Calendar pstngDate,
                   String materialDescription,
                   int quantity,
                   String bun,
                   double amountLC,
                   String crcy,
                   String userName) {
        this.matDoc = matDoc;
        this.item = item;
        this.docDate = docDate;
        this.pstngDate = pstngDate;
        this.materialDescription = materialDescription;
        this.quantity = quantity;
        this.bun = bun;
        this.amountLC = amountLC;
        this.crcy = crcy;
        this.userName = userName;
    }

    public Posting(String matDoc,
                   int item,
                   Calendar docDate,
                   Calendar pstngDate,
                   String materialDescription,
                   int quantity,
                   String bun,
                   double amountLC,
                   String crcy,
                   String userName,
                   boolean isAuthorized) {
        this.matDoc = matDoc;
        this.item = item;
        this.docDate = docDate;
        this.pstngDate = pstngDate;
        this.materialDescription = materialDescription;
        this.quantity = quantity;
        this.bun = bun;
        this.amountLC = amountLC;
        this.crcy = crcy;
        this.userName = userName;
        this.isAuthorized = isAuthorized;
    }

    public String getMatDoc() {
        return matDoc;
    }

    public void setMatDoc(String matDoc) {
        this.matDoc = matDoc;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Calendar getDocDate() {
        return docDate;
    }

    public void setDocDate(Calendar docDate) {
        this.docDate = docDate;
    }

    public Calendar getPstngDate() {
        return pstngDate;
    }

    public void setPstngDate(Calendar pstngDate) {
        this.pstngDate = pstngDate;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public double getAmountLC() {
        return amountLC;
    }

    public void setAmountLC(double amountLC) {
        this.amountLC = amountLC;
    }

    public String getCrcy() {
        return crcy;
    }

    public void setCrcy(String crcy) {
        this.crcy = crcy;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString() {
        return "Posting{" +
                "matDoc='" + matDoc + '\'' +
                ", item=" + item +
                ", docDate=" + docDate +
                ", pstngDate=" + pstngDate +
                ", materialDescription='" + materialDescription + '\'' +
                ", quantity=" + quantity +
                ", bun='" + bun + '\'' +
                ", amountLC=" + amountLC +
                ", crcy='" + crcy + '\'' +
                ", userName='" + userName + '\'' +
                ", isAuthorized=" + isAuthorized +
                '}';
    }
}
