package mnj.mfg.model.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 04 12:39:17 PKT 2016
// ---------------------------------------------------------------------
public interface MainAM extends ApplicationModule {
    void FillRollLines();

    void setRollwhereClause();

    void FillRollLines1();

    void setRollwhereClause1();

    void popSizeAll(Row poprow);

    void popSizeAll1(Row poprow);

    void selectAllLines(String flag);

    void selectAllLines1(String flag);


    void setRollwhereClauseBPO();

    void FillRollLinesBPO();

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    void setSizeWhereClause(String bpo, String stn, String color,
                            String challan_no);

    void receiveSizeQtyValueChangeListener(String Quantity);

    void pageLoadEvent();

    void selectAllLines0(String flag);
}
