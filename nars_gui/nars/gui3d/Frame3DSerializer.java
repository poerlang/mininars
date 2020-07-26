package nars.gui3d;

import com.jme3.math.Vector3f;
import com.jme3.network.serializing.Serializer;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Frame3DSerializer extends Serializer {

    @Override
    public <T> T readObject(ByteBuffer byteBuffer, Class<T> aClass) throws IOException {
        Frame3D frame3D = new Frame3D();
        frame3D.opt = (String) Serializer.readClassAndObject(byteBuffer);
        frame3D.endPos = (Vector3f) Serializer.readClassAndObject(byteBuffer);
        frame3D.startPos = (Vector3f) Serializer.readClassAndObject(byteBuffer);
        frame3D.endPosSize = (float) Serializer.readClassAndObject(byteBuffer);
        frame3D.startPosSize = (float) Serializer.readClassAndObject(byteBuffer);
        return (T) frame3D;
    }

    @Override
    public void writeObject(ByteBuffer byteBuffer, Object o) throws IOException {
        Frame3D frame3D = (Frame3D) o;
        Serializer.writeClassAndObject(byteBuffer,frame3D.opt);
        Serializer.writeClassAndObject(byteBuffer,frame3D.endPos);
        Serializer.writeClassAndObject(byteBuffer,frame3D.startPos);
        Serializer.writeClassAndObject(byteBuffer,frame3D.endPosSize);
        Serializer.writeClassAndObject(byteBuffer,frame3D.startPosSize);
    }
}
