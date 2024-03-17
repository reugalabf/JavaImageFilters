package Pipes;

import java.awt.image.BufferedImage;
import ImageFilters.ImageFilter;

public interface ImageFilterPipeInterface {
    
    public BufferedImage filter(BufferedImage image);
    public void addFilter(ImageFilter next);
    public void setNextPipe(ImageFilterPipe newPipe);
    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe);
    
}
