import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class ExemploMapasTest {

    @Test
    public void adicionandoElementoNoMapa() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        System.out.println(jogaores.size());
    }

    @Test
    public void buscandoElementoExistenteNoMapa() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        String jogadorProcurado = jogaores.get(1);
        String nomeEsperado = "Alisson";
        System.out.println(jogadorProcurado);
        Assert.assertEquals(nomeEsperado, jogadorProcurado);
    }

    @Test
    public void buscandoElementoNaoExistenteNoMapa() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        String jogadorProcurado = jogaores.get(100);
        System.out.println(jogadorProcurado);
        Assert.assertNull(jogadorProcurado);
    }

    @Test
    public void excluindoElementoNoMapa() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        String jogadorProcurado = jogaores.get(18);
        System.out.println(jogadorProcurado);

        System.out.println(jogaores.containsKey(18));
        jogaores.remove(18);
        System.out.println(jogaores.containsKey(18));

        String jogadorProcuradoDepoisDaRemocao = jogaores.get(18);
        System.out.println(jogadorProcuradoDepoisDaRemocao);
        Assert.assertNull(jogadorProcuradoDepoisDaRemocao);
    }

    @Test
    public void iterandoUmMapa() {

        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        for (Integer chave : jogaores.keySet()) {
            System.out.println("Camisa: " + chave + " | Nome: " + jogaores.get(chave));
        }

    }

    @Test
     public void exemploContemChaveBarraChavePesquisada() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        boolean contemJogadorPesquisado = jogaores.containsKey(17);
        Assert.assertTrue(contemJogadorPesquisado);
    }

    @Test
    public void exemploNaoContemChaveBarraChavePesquisada() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        boolean contemJogadorPesquisado = jogaores.containsKey(44);
        Assert.assertFalse(contemJogadorPesquisado);
    }

    @Test
    public void exemploContemValor() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        boolean contemJogadorPesquisado = jogaores.containsValue("Neymar");
        Assert.assertTrue(contemJogadorPesquisado);
    }

    @Test
    public void exemploNaoContemValor() {
        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        boolean contemJogadorPesquisado = jogaores.containsValue("Pele");
        Assert.assertFalse(contemJogadorPesquisado);
    }

    @Test
    public void limpandoUmMapa() {

        Map<Integer, String> jogaores = new HashMap<Integer, String>();
        jogaores.put(10, "Neymar");
        jogaores.put(1, "Alisson");
        jogaores.put(6, "Filipe Luís");
        jogaores.put(12, "Marcelo");
        jogaores.put(14, "Danilo");
        jogaores.put(22, "Fagner");
        jogaores.put(13, "Marquinhos");
        jogaores.put(5, "Casemiro");
        jogaores.put(11, "Philippe Coutinho");
        jogaores.put(17, "Fernandinho");
        jogaores.put(18, "Fred");
        jogaores.put(20, "Roberto Firmino");
        jogaores.put(9, "Gabriel Jesus");

        int tamahoDoMapa = jogaores.size();

        System.out.println(tamahoDoMapa);

        jogaores.clear();

        int tamahoDoMapaDepoisDoClear = jogaores.size();

        System.out.println(tamahoDoMapaDepoisDoClear);



    }
}
