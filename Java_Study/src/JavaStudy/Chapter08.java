package JavaStudy;
/**
 * OCJP-Goldの8章
 * ファイル操作、作成、書き込みのためのクラス
 * @author t-oda
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter08 {
	File javaDir = new File("C:\\Users\\t-oda\\git\\dev1\\Java_Study\\sample\\");
	String javaDirPath = javaDir.getAbsolutePath();
	File javaFile = new File(javaDirPath + "\\ " + "java.txt");
	String strFilePath = javaFile.getAbsolutePath();
    /**
     * ファイル生成するメソッド
     * @throws IOException
     * @param なし
     */
	public void createFile() {

	/*File f1 = new File("ren/dir");
	File f2 = new File("ren" , "a.txt");
	File f3 = new File(f1 , "x.txt");

	for(File f : f1.listFiles()) {
		if(f.isFile()) {
			System.out.println(" ファイル　：" + f.getName());
		}else if(f.isDirectory()) {
			System.out.println(" ディレクトリ　：" + f.getName());
		}
	}
	System.out.println("path for f1 : " + f1.getAbsolutePath());
	System.out.println("path for f2 : " + f2.getAbsolutePath());
	System.out.println("path for f3 : " + f3.getAbsolutePath());
	System.out.println("使用しているパスの区切り文字 : " + System.getProperty("file.separator"));
	*/

		System.out.println("pass : " + strFilePath);

		if(javaDir.mkdir()) {
			System.out.println("mkdir Success");
		}else {
			System.out.println("mkdir Fail");
		}

		//ファイル生成
		try {
			if(javaFile.createNewFile()) {
				System.out.println("createNewFile Success");
			}else {
				System.out.println("createNewFile Fail");
			}
		}catch(IOException e){
			System.out.println(e);
		}

	}

    /**
     * ファイルへの書き込みをするメソッド
     * @param なし
     * @throws IOException
     * @throws FileNotFoundException
     */
	public void inoutFile() throws IOException {
		FileOutputStream fos = null;
		FileInputStream fis = null;

		//ファイル書き込み
		try {

		fos = new FileOutputStream(new File(strFilePath));
		fos.write(0);
		fos.write("suzuki".getBytes());
		fos.write(99);

		fis= new FileInputStream(new File(strFilePath));
		int data = 0;

			while((data = fis.read()) != -1) {
				//読み込んだデータの表示
				System.out.print(data + " ");

			}

		}catch(FileNotFoundException e) {

			System.err.println("File Not Found");

		}catch(IOException e) {

			System.err.println("IO Error");
		}finally {
			try {
				fos.close();
				fis.close();
			}catch(IOException e) {

				System.err.println("IO Error : Failed while fos closing");
			}
		}
	}
}
