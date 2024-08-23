package unidade4;

import javax.swing.JOptionPane;

import com.abctreinamentos.siscapacit.ServidorPublico;

/***********************************/
public interface APIServidorPublico 
/***********************************/
{	
		public void adicionarServidorPublico();
		
		public void listarServidoresPublicos();
		
		public void listarServidorPublico(int matricula);
		
		public void alterarServidorPublico(ServidorPublico servidorAlterado);
		
		public void excluirServidorPublico(int matricula);
}
