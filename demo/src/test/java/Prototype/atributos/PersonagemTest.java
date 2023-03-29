package Prototype.atributos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


class PersonagemTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem("Paula Atraz", 2, 0, 3, new Status("Nenhum", "Sim") );

        Personagem personagemClone = personagem.clone();
        personagem.setNome("Personagem Clonado");
        personagem.setForca(3);
        personagem.setDestreza(3);
        personagem.setConstituicao(2);

        assertEquals("Personagem{'Nome=Paula Atraz', Força=2, Destreza=0, Constituição= 3, Status=Status{Doença='Nenhum', Fome='Sim'}}", personagem.toString());
        assertEquals("Personagem{'Personagem Clonado', Força=3, Destreza=3, Constituição= 2, Status=Status{Doença='Nenhum', Fome='Sim'}}", personagemClone.toString());
    }
}