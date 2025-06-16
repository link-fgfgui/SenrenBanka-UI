package com.img.utils;

import com.mojang.blaze3d.vertex.*;
import org.joml.Matrix4f;

/**
 * @author : IMG
 * @create : 2025/2/16
 * @description : 来自<a href="https://github.com/paulzzh/YuZuUI-GTNH/blob/master/src/main/java/com/paulzzh/yuzu/gui/RenderUtils.java">paulzzh/YuZuUI-GTNH</a>, 有部分修改
 */
public class RenderUtils {
    public static void blit(float x, float y, float width, float height, PoseStack poseStack) {
        Matrix4f matrix = poseStack.last().pose();
        BufferBuilder buf = Tesselator.getInstance().begin(
                VertexFormat.Mode.QUADS,
                DefaultVertexFormat.POSITION_TEX
        );
        buf.addVertex(matrix, x,   y,          0).setUv(0f, 0f);
        buf.addVertex(matrix, x,         y + height, 0).setUv(0f, 1f);
        buf.addVertex(matrix, x + width, y + height, 0).setUv(1f, 1f);
        buf.addVertex(matrix, x + width, y,          0).setUv(1f, 0f);

        BufferUploader.drawWithShader(buf.buildOrThrow());
    }
}
