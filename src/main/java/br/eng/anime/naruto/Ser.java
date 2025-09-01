package br.eng.anime.naruto;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private String apelido;
    private int chakra;
    
    private List<Artefato> artefato = new ArrayList<Artefato>();
    private EntidadePolitica governa;
    private List<Jutsu> jutsus = new ArrayList<Jutsu>();

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getChakra() {
        return chakra;
    }
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
    public List<Artefato> getArtefato() {
        return artefato;
    }
    public void setArtefato(List<Artefato> artefato) {
        this.artefato = artefato;
    }
    public EntidadePolitica getGoverna() {
        return governa;
    }
    public void setGoverna(EntidadePolitica governa) {
        this.governa = governa;
    }
    public List<Jutsu> getJutsus() {
        return jutsus;
    }
    public void setJutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
    }

    
}
