package interfaceTest;

interface ProgrammerInterview {
	public void read();
}

class Website {
	ProgrammerInterview p = new ProgrammerInterview() {
		public void read() {
			System.out.println("Interface itself");
		}
	};
	public void read() {
		System.out.println("Class itself");
	}
}

class Main {
	public static void main(String[] args) {
		Website web = new Website();
		web.p.read();
		web.read();
	}
}