package hanze.itv1e.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Iterator;
import java.math.BigDecimal;import javax.persistence.*;
import java.math.RoundingMode;


@Entity
@Table(name = "factuurregel")
public class FactuurRegel implements Serializable {
    @Id
    @Column(name = "factuurregel_id", unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Factuur factuur;

    @Embedded
    private Artikel artikel;

    public FactuurRegel() {}
    public FactuurRegel(Factuur factuur, Artikel artikel) {
        this.factuur = factuur;
        this.artikel = artikel;
    }
    /**
     * @return een printbare factuurregel
     */
    public String toString() {
        return "";
    }
}