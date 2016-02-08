package res;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class QuerySelector {
	/**
	 * @param file
	 * @param queryName
	 * @param query
	 */
	public static String selectQuery(String file, String queryName){
		String line = null;
		BufferedReader br = null;
		URL path = QuerySelector.class.getResource("/querys/" + file + ".txt");
		FileReader fr;
		try{
			fr = new FileReader(path.getPath());
			br = new BufferedReader(fr);
			String query = "";
			boolean writeQuery = false;
			while((line = br.readLine()) != null){
				if (line.contains("}")){
					if(line.equals(queryName + "{")){
						writeQuery = true;
						continue;
					}
				}
				if(line.contains("}")){
					writeQuery = false;
				}
				if(writeQuery){
					query += line;
				}
			} 
			return query;
		}catch(NullPointerException | IOException e){
			System.out.println(e.getMessage() + e.getCause().toString());
			return "";
		}finally{
			try{
				br.close();
			}catch(IOException | NullPointerException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
