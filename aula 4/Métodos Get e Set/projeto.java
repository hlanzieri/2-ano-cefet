public class projeto {
    public static void main(String args[]){
        Carro meuCarro = new Carro();
        Pessoa Dono = new Pessoa();

        meuCarro.setCor("Azul da meia noite");
        meuCarro.setTipo("Passeio");
        meuCarro.setPlaca("RUR7I72");
        meuCarro.setNumPortas(4);

        Dono.setNome("Humberto de Moraes Lanzieri");
        Dono.setIdade(50);
        Dono.setBiotipo("Mesomorfo");
        Dono.setCorDoCabelo("Preto");

        System.out.println("--------------CARRO-----------------");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Tipo: "+meuCarro.getTipo());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Número de Portas: "+meuCarro.getNumPortas());

        System.out.println("--------------DONO-----------------");
        System.out.println("Nome: "+Dono.getNome());
        System.out.println("Idade: "+Dono.getidade());
        System.out.println("Biotipo: "+Dono.getBiotipo());
        System.out.println("Cor do cabelo: "+Dono.getCorDoCabelo());
    }
}
