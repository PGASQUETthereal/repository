package deploimentt;
import org.opencv.core.Core;


public class testopencv {
    public static void main(String[] args) {
        // Charger la bibliothèque native OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Afficher un message pour vérifier le chargement de la bibliothèque
        System.out.println("La bibliothèque OpenCV est chargée avec succès !");
    }
}

