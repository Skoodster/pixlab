package CBLabs.PictureLab.classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** display amount of red pixels in image */
    public static void testCountRed(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.countRed();
        beach.explore();
    }
    
    /** half picture red */
    public static void textHalfRed(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/redMotorcycle.jpg");
        beach.explore();
        beach.halfRed();
        beach.explore();
    }

    /** test zero blue, red, green */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
    public static void testZeroRed()
    {
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }
    public static void testZeroGreen()
    {
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.zeroGreen();
        beach.explore();
    }

    /** keep only blue, red, green */
    public static void keepOnlyBlue(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.onlyBlue();
        beach.explore();
    }
    public static void keepOnlyRed(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.onlyRed();
        beach.explore();
    }
    public static void keepOnlyGreen(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.onlyGreen();
        beach.explore();
    }
    
    /** greyscale */    
    public static void textGreysScale(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.greyScale();
        beach.explore();
        }
        
    /** inverted */
    public static void testInverted(){
        Picture beach = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/beach.jpg");
        beach.explore();
        beach.Inverted();
        beach.explore();
    }
    
    /** makes water clearer */
    public static void textFixUnderwater(){
        Picture water = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }
    
    /** Mirror L to R */
    public static void testMirrorLtoR() //L to R
    {
        Picture swan = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/swan.jpg");
        swan.explore();
        swan.mirrorLtoR();
        swan.explore();
    }

    /** Mirror R to L */
    public static void testMirrorRtoL(){ //R to L
        Picture swan = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/swan.jpg");
        swan.explore();
        swan.mirrorRtoL();
        swan.explore();
    }
    
    /** Mirror Bottom to Top */
    public static void testMirrorBtoT(){
        Picture swan = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/swan.jpg");
        swan.explore();
        swan.bottomtop();
        swan.explore();
    }
    
    /** Mirror Top to Bottom */
    public static void testMirrorTtoB(){
        Picture swan = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/swan.jpg");
        swan.explore();
        swan.topbottom();
        swan.explore();
    }
    
    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("C:/Users/jules/Downloads/pictureLab/pixLab/images/swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }
    
    
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testZeroRed();
        testZeroGreen();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGreyScale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
