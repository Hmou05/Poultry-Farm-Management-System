interface IPaiement {
    String id;
    String type;
    String method;
    String description;
    float total;
    String status;
    float getTotal();
};


public class paiementModel implements IPaiement {
    void paiementModel(id, type, method, description, total, status) {
        super(id, type, method, description, total, status);
    }
    @override
    public float getTotal() {
        return this.total;
    }
}
