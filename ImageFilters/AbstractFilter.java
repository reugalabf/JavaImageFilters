package ImageFilters;




import java.awt.image.BufferedImage;

public abstract class AbstractFilter implements ImageFilters.ImageFilter{
  abstract public BufferedImage filter(BufferedImage image);
}
