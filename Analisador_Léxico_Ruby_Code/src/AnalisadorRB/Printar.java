package AnalisadorRB;

public class Printar {
	
	StringBuffer nameValue = new StringBuffer();
	StringBuffer lineColumn = new StringBuffer();
	StringBuffer colum = new StringBuffer();
	StringBuffer desc = new StringBuffer();
	
	public Printar(String name, String value, int line, int column){
		this.nameValue.append( "< "+name+", "+value+" >" );
		this.lineColumn.append( "Linha: "+line+" - Coluna: "+column );
		
	}
	
	public Printar(String name, String value, int line, int column, String desc ){
		this.nameValue.append( "< "+name+", "+value+" >" );
		this.lineColumn.append( "Linha: "+line+" - Coluna: "+column );
		tamDesc(new StringBuffer(desc));
	}
	
	public String tamNameValue(){
		int falta = 35 - this.nameValue.length();
		for(int i = 0; i<falta; i++){
			this.nameValue.append( " " );
		}
		System.out.println(nameValue.toString());
		return nameValue.toString();
	}
	
	public String tamLineColumn(){
		
		int falta = 28 - this.lineColumn.length();
		for(int i = 0; i<falta; i++){
			this.lineColumn.append( " " );
		}
		
		return lineColumn.toString();
	}
	
	private void tamDesc(StringBuffer desc){
		for(int i = 0; i<desc.length(); i++){
			if(i >= 40 && i%40 == 0){
				for(int j = 1; j<= 63; j++){
					this.desc.append( "" );
				}
			}
			this.desc.append( desc.substring(0+i, 1+i) );
		}
		
	}
	
	public String getDesc() {
		return desc.toString();
	}
	
}
