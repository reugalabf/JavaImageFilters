package Pipes;

import ImageFilters.ImageFilter;
import java.awt.image.BufferedImage;

public class EndPipe implements ImageFilter, ImageFilterPipeInterface {
    
    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe){
        aPipe.setNextPipe(newPipe); 
        
    }
    public void setNextPipe(ImageFilterPipe newPipe){}

    public void addFilter(ImageFilter next){}

    public BufferedImage filter(BufferedImage image) {
        return image;
    }
}
