package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }


}
