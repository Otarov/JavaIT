package files;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

//		String path = System.getProperty("user.dir") + "\\JavaIT\\RasulProject\\src\\files";
		String path = "D:/";
		System.out.println(path);
		File f = new File(path);
		System.out.println(f.getName());
		printArrStr(f.list(), f.getName());
		checkingTheCurrentDir(f);
		

	}

	public static void checkingTheCurrentDir(File fileOrDir) {

		if (fileOrDir.isDirectory()) {
			String[] res = fileOrDir.list();
			printArrStr(res, fileOrDir.getName());
			if (res.length == 0) System.out.println(fileOrDir.getName() + " - это пустой каталог");
			else {
				for (String str : res){
					String pathSubDir = fileOrDir.getAbsolutePath() + "//" + str;
					File subDir = new File(pathSubDir);
					System.out.println();
					checkingTheCurrentDir(subDir);
				}
			}
		}
		else {
			System.out.println(fileOrDir.getName() + " - это файл");
			
			System.out.println(fileOrDir.canRead()  +  " - чтение");
			System.out.println(fileOrDir.length() +  " байт памяти занимает");
		}
		

	}
	
	public static void printArrStr(String[] str, String dir){
		System.out.println("Содержимое " + dir);
		for (String s : str){
			System.out.print(s + " ");
		}
		System.out.println(".");
		System.out.println("---------------------------");
	}

}
