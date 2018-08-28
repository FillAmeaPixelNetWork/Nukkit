package cn.nukkit.entity.data;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Base64;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class Skin {

    public static final int SINGLE_SKIN_SIZE = 64 * 32 * 4;
    public static final int DOUBLE_SKIN_SIZE = 64 * 64 * 4;
    public static final int SKIN_128_64_SIZE = 128 * 64 * 4;
    public static final int SKIN_128_128_SIZE = 128 * 128 * 4;

    public static final String MODEL_STEVE = "Standard_Steve";
    public static final String MODEL_ALEX = "Standard_Alex";

    private byte[] data = new byte[SINGLE_SKIN_SIZE];
    private String model;
    private Cape cape = new Cape(new byte[0]);  //default no cape
    private SkinGeometry geometryModel = new SkinGeometry();

    public Skin(byte[] data) {
        this(data, MODEL_STEVE);
    }

    public Skin(InputStream inputStream) {
        this(inputStream, MODEL_STEVE);
    }

    public Skin(ImageInputStream inputStream) {
        this(inputStream, MODEL_STEVE);
    }

    public Skin(File file) {
        this(file, MODEL_STEVE);
    }

    public Skin(URL url) {
        this(url, MODEL_STEVE);
    }

    public Skin(BufferedImage image) {
        this(image, MODEL_STEVE);
    }

    public Skin(byte[] data, String model) {
        this.setData(data);
        this.setModel(model);
    }

    public Skin(InputStream inputStream, String model) {
        BufferedImage image;
        try {
            image = ImageIO.read(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.parseBufferedImage(image);
        this.setModel(model);
    }

    public Skin(ImageInputStream inputStream, String model) {
        BufferedImage image;
        try {
            image = ImageIO.read(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.parseBufferedImage(image);
        this.setModel(model);
    }

    public Skin(File file, String model) {
        BufferedImage image;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.parseBufferedImage(image);
        this.setModel(model);
    }

    public Skin(URL url, String model) {
        BufferedImage image;
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.parseBufferedImage(image);
        this.setModel(model);
    }

    public Skin(BufferedImage image, String model) {
        this.parseBufferedImage(image);
        this.setModel(model);
    }

    public Skin(String base64) {
    	byte[] decode = null;
    	try {
    		decode = Base64.getUrlDecoder().decode(base64);
    	} catch(IllegalArgumentException e) {
    		decode = Base64.getDecoder().decode(base64);
    	}
    	this.setData(decode);
        this.setModel(MODEL_STEVE);
    }

    public Skin(String base64, String model) {
    	byte[] decode = null;
    	try {
    		decode = Base64.getUrlDecoder().decode(base64);
    	} catch(IllegalArgumentException e) {
    		decode = Base64.getDecoder().decode(base64);
    	}
    	this.setData(decode);
        this.setModel(model);
    }

    public void parseBufferedImage(BufferedImage image) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y), true);
                outputStream.write(color.getRed());
                outputStream.write(color.getGreen());
                outputStream.write(color.getBlue());
                outputStream.write(color.getAlpha());
            }
        }
        image.flush();
        this.setData(outputStream.toByteArray());
    }

    public byte[] getData() {
        return data;
    }

    public String getModel() {
        return model;
    }

    public void setData(byte[] data) {
        if (data.length != SINGLE_SKIN_SIZE && data.length != DOUBLE_SKIN_SIZE && data.length != SKIN_128_64_SIZE && data.length != SKIN_128_128_SIZE) {
            //throw new IllegalArgumentException("Invalid skin");
        }
        this.data = data;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            model = MODEL_STEVE;
        }

        this.model = model;
    }

    public Cape getCape() {
        return cape;
    }

    public void setCape(Cape cape) {
        this.cape = cape;
    }

    public boolean isValid() {
        return this.data.length == SINGLE_SKIN_SIZE || this.data.length == DOUBLE_SKIN_SIZE || this.data.length == SKIN_128_64_SIZE || this.data.length == SKIN_128_128_SIZE;
    }

    public SkinGeometry getGeometryModel() {
        return geometryModel;
    }

    public Skin setGeometryModel(SkinGeometry geometryModel) {
        this.geometryModel = geometryModel;
        return this;
    }

    public class Cape {

        public byte[] data;

        public Cape(byte[] data) {
            this.setData(data);
        }

        public Cape(InputStream inputStream) {
            BufferedImage image;
            try {
                image = ImageIO.read(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            this.parseBufferedImage(image);
        }

        public Cape(ImageInputStream inputStream) {
            BufferedImage image;
            try {
                image = ImageIO.read(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.parseBufferedImage(image);
        }

        public Cape(File file, String model) {
            BufferedImage image;
            try {
                image = ImageIO.read(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.parseBufferedImage(image);
        }

        public Cape(URL url) {
            BufferedImage image;
            try {
                image = ImageIO.read(url);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.parseBufferedImage(image);
        }

        public Cape(BufferedImage image) {
            this.parseBufferedImage(image);
        }

        public Cape(String base64) {
        	byte[] decode = null;
        	try {
        		decode = Base64.getUrlDecoder().decode(base64);
        	} catch(IllegalArgumentException e) {
        		decode = Base64.getDecoder().decode(base64);
        	}
        	this.setData(decode);
        }

        public void setData(byte[] data) {
            this.data = data;
        }

        public byte[] getData() {
            return data;
        }

        public void parseBufferedImage(BufferedImage image) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y), true);
                    outputStream.write(color.getRed());
                    outputStream.write(color.getGreen());
                    outputStream.write(color.getBlue());
                    outputStream.write(color.getAlpha());
                }
            }
            image.flush();
            this.setData(outputStream.toByteArray());
        }
    }

    public static class SkinGeometry {
        private String model;
        private String data;

        public SkinGeometry() {
            this("", "");
        }

        public SkinGeometry(String model, String data) {
            this.model = model == null ? "" : model;
            this.data = data == null ? "" : data;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getModel() {
            return model;
        }

        public String getData() {
            return data;
        }
    }

}
