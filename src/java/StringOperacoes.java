package java;

public class StringOperacoes {

/**
	 * lista1 recebe uma lista de Objetos que contem a chave estrangeira
	 * lista2 recebe um lista de objetos onde contem a chave primaria
	 * fieldkey1 chave estrangeira da 1 lista, deve ser informado o nome do metodo que a recurepa ex(getIdCurso)
	 * fieldkey2 chave da relacao entre as tabelas, deve ser informado o nome do metodo que a recupera ex (getId)]
	 * fieldResult2 campo desejado da 2 tabela , deve ser informado o nome do metodo que a recupera (getdescricao)
	 * @param lista1  
	 * @param lista2  
	 * @param fieldKey1
	 * @param fieldKey2
	 * @param fieldResult2
	 * @return
	 */
	public HashMap<Number, String> joinListOneToOne(List<?> lista1, List<?> lista2,
			String fieldKey1, String fieldKey2, String fieldResult2) {

		HashMap<Number, String> resultMap = new HashMap<Number, String>();
		try {

			Class classe1 = lista1.get(0).getClass();
			Class classe2 = lista2.get(0).getClass();
			
			for (Object obj1 : lista1 ) {
			
				Method m1 = classe1.getMethod(fieldKey1);
				Number key1 = (Number) m1.invoke(obj1);
				
				for (Object obj2 :lista2){
					
					Method m2 = classe2.getMethod(fieldKey2);
					Number key2 = (Number) m2.invoke(obj2);
					
					if (key1.intValue() == key2.intValue() ){
						
						Method m3 = classe2.getMethod(fieldResult2);
						String result = (String) m3.invoke(obj2);
						
						resultMap.put(key2,result);
						break;
					}
				}
			}
		} catch (Exception ex) {
		  ex.printStackTrace();
		}
		return resultMap;
	}
}
