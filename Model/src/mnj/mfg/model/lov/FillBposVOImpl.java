package mnj.mfg.model.lov;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 03 17:48:37 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FillBposVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public FillBposVOImpl() {
    }


    /**
     * Returns the bind variable value for p_trans_type.
     * @return bind variable value for p_trans_type
     */
    public String getp_trans_type() {
        return (String)getNamedWhereClauseParam("p_trans_type");
    }

    /**
     * Sets <code>value</code> for bind variable p_trans_type.
     * @param value value to bind as p_trans_type
     */
    public void setp_trans_type(String value) {
        setNamedWhereClauseParam("p_trans_type", value);
    }


}