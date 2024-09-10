package ex3;

public class Main {
        public static void main(String[] args) {
            
            Universidade princeton = new Universidade("Princeton", "Estados Unidos da América");
            Universidade cambridge = new Universidade("Cambridge", "Inglaterra");
    
            Pessoa einstein = new Pessoa("Albert Einstein", "14/3/1879");
            Pessoa newton = new Pessoa("Isaac Newton", "4/1/1643");
    
            einstein.setUniversidade(princeton);
            newton.setUniversidade(cambridge);
         }
    }
