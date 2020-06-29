public class Datas_Q1 {
	private int dia, mes, ano;

	public Datas_Q1(int d, int m, int a) {
		ano = setAno(a);
		mes = setMes(m);
		dia = setDia(d);
	}

	public int setMes(int v) {
		if (v > 0 && v <= 12) {
			return mes = v;
		} else {

			System.out.println("Mês inválido.");
			System.exit(1);
			return 0;
		}
	}

	public int setAno(int v) {
		if (v > 1969 && v <= 2030) {
			return ano = v;
		} else {
			System.out.println("ano inválido - insira um ano entre 1969 e 2030");
			System.exit(1);
			return 0;
		}
	}

	public boolean bissexto() {
		if (getAno() % 4 == 0)
			return true;
		else
			return false;
	}

	public int setDia(int v) {
		
		if (getMes() == 1) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 2 && bissexto() == true) {
			if (v > 0 && v <= 29) {
				return dia = v;
			}

		} else if (getMes() == 2 && bissexto() == false) {
			if (v > 0 && v <= 28) {
				return dia = v;
			}

		} else if (getMes() == 3) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 4) {
			if (v > 0 && v <= 30) {
				return dia = v;
			}

		} else if (getMes() == 5) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 6) {
			if (v > 0 && v <= 30) {
				return dia = v;
			}

		} else if (getMes() == 7) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 8) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 9) {
			if (v > 0 && v <= 30) {
				return dia = v;
			}

		} else if (getMes() == 10) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		} else if (getMes() == 11) {
			if (v > 0 && v <= 30) {
				return dia = v;
			}

		} else if (getMes() == 12) {
			if (v > 0 && v <= 31) {
				return dia = v;
			}

		}
		System.out.println("Dia inserido inválido para o mês em vigor");
		System.exit(1);
		return 0;
	}

	public int getAno() {
		return ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public String toString() {
		String s = " ";
		if (dia<10) 
			s = "Data: 0"+dia;
		else
			s = "Data: "+dia;
		
		if(mes<10)
			s= s+"/0"+mes;
		else
			s= s+"/"+mes;
		
		s = s+"/"+ano;
		return s;
	}

}
