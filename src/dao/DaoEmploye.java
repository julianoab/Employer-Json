package dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Employe;

public class DaoEmploye {

	// Metodo que realiza a leitura do arquivo Json
	public String leituraArq() throws Exception {

		try {

			FileInputStream employer = new FileInputStream("C:\\projetos_javaweb\\javateste\\employees.json");
			InputStreamReader readEmployer = new InputStreamReader(employer);
			BufferedReader readEmploy = new BufferedReader(readEmployer);

			String linha = "";
			String resultado = "";

			do {

				linha = readEmploy.readLine();

				if (linha != null) {

					resultado += linha;
				}

			} while (linha != null);

			return resultado;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// metodo realiza a conversão do arquivo para uma lista de objetos
	public List<Employe> listar() throws Exception {

		String json = leituraArq();

		Gson gson = new Gson();
		Type listaEmployeType = new TypeToken<List<Employe>>() {
		}.getType();
		System.out.println("passou por aqui");
		List<Employe> employe = gson.fromJson(json, listaEmployeType);
		return employe;
	}

	// metodo que realiza a busca das skills
	public List<Employe> listando(String skill) throws Exception {

		List<Employe> list = listar();

		for (Employe a : list) {

			if (a.getName().equals(skill)) {
				list.add(a);
			}
		}
		return list;
	}

}
