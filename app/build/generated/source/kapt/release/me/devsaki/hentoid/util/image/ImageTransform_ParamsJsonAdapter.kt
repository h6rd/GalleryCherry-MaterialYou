// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package me.devsaki.hentoid.util.image

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString
import me.devsaki.hentoid.enums.PictureEncoder

public class ImageTransform_ParamsJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<ImageTransform.Params>() {
  private val options: JsonReader.Options = JsonReader.Options.of("resizeEnabled", "resizeMethod",
      "resize1Ratio", "resize2Height", "resize2Width", "resize3Ratio", "transcodeMethod",
      "transcoderAll", "transcoderLossy", "transcoderLossless", "transcodeQuality")

  private val booleanAdapter: JsonAdapter<Boolean> = moshi.adapter(Boolean::class.java, emptySet(),
      "resizeEnabled")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(),
      "resizeMethod")

  private val pictureEncoderAdapter: JsonAdapter<PictureEncoder> =
      moshi.adapter(PictureEncoder::class.java, emptySet(), "transcoderAll")

  @Volatile
  private var constructorRef: Constructor<ImageTransform.Params>? = null

  public override fun toString(): String = buildString(43) {
      append("GeneratedJsonAdapter(").append("ImageTransform.Params").append(')') }

  public override fun fromJson(reader: JsonReader): ImageTransform.Params {
    var resizeEnabled: Boolean? = null
    var resizeMethod: Int? = null
    var resize1Ratio: Int? = null
    var resize2Height: Int? = null
    var resize2Width: Int? = null
    var resize3Ratio: Int? = null
    var transcodeMethod: Int? = null
    var transcoderAll: PictureEncoder? = null
    var transcoderLossy: PictureEncoder? = null
    var transcoderLossless: PictureEncoder? = null
    var transcodeQuality: Int? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> resizeEnabled = booleanAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("resizeEnabled", "resizeEnabled", reader)
        1 -> resizeMethod = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("resizeMethod",
            "resizeMethod", reader)
        2 -> resize1Ratio = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("resize1Ratio",
            "resize1Ratio", reader)
        3 -> resize2Height = intAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("resize2Height", "resize2Height", reader)
        4 -> resize2Width = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("resize2Width",
            "resize2Width", reader)
        5 -> resize3Ratio = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("resize3Ratio",
            "resize3Ratio", reader)
        6 -> transcodeMethod = intAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("transcodeMethod", "transcodeMethod", reader)
        7 -> transcoderAll = pictureEncoderAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("transcoderAll", "transcoderAll", reader)
        8 -> transcoderLossy = pictureEncoderAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("transcoderLossy", "transcoderLossy", reader)
        9 -> transcoderLossless = pictureEncoderAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("transcoderLossless", "transcoderLossless", reader)
        10 -> transcodeQuality = intAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("transcodeQuality", "transcodeQuality", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xffffffff.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  ImageTransform.Params(
          resizeEnabled = resizeEnabled ?: throw Util.missingProperty("resizeEnabled",
              "resizeEnabled", reader),
          resizeMethod = resizeMethod ?: throw Util.missingProperty("resizeMethod", "resizeMethod",
              reader),
          resize1Ratio = resize1Ratio ?: throw Util.missingProperty("resize1Ratio", "resize1Ratio",
              reader),
          resize2Height = resize2Height ?: throw Util.missingProperty("resize2Height",
              "resize2Height", reader),
          resize2Width = resize2Width ?: throw Util.missingProperty("resize2Width", "resize2Width",
              reader),
          resize3Ratio = resize3Ratio ?: throw Util.missingProperty("resize3Ratio", "resize3Ratio",
              reader),
          transcodeMethod = transcodeMethod ?: throw Util.missingProperty("transcodeMethod",
              "transcodeMethod", reader),
          transcoderAll = transcoderAll ?: throw Util.missingProperty("transcoderAll",
              "transcoderAll", reader),
          transcoderLossy = transcoderLossy ?: throw Util.missingProperty("transcoderLossy",
              "transcoderLossy", reader),
          transcoderLossless = transcoderLossless ?:
              throw Util.missingProperty("transcoderLossless", "transcoderLossless", reader),
          transcodeQuality = transcodeQuality ?: throw Util.missingProperty("transcodeQuality",
              "transcodeQuality", reader)
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<ImageTransform.Params> = this.constructorRef ?:
          ImageTransform.Params::class.java.getDeclaredConstructor(Boolean::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,
          PictureEncoder::class.java, PictureEncoder::class.java, PictureEncoder::class.java,
          Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          resizeEnabled ?: throw Util.missingProperty("resizeEnabled", "resizeEnabled", reader),
          resizeMethod ?: throw Util.missingProperty("resizeMethod", "resizeMethod", reader),
          resize1Ratio ?: throw Util.missingProperty("resize1Ratio", "resize1Ratio", reader),
          resize2Height ?: throw Util.missingProperty("resize2Height", "resize2Height", reader),
          resize2Width ?: throw Util.missingProperty("resize2Width", "resize2Width", reader),
          resize3Ratio ?: throw Util.missingProperty("resize3Ratio", "resize3Ratio", reader),
          transcodeMethod ?: throw Util.missingProperty("transcodeMethod", "transcodeMethod",
              reader),
          transcoderAll ?: throw Util.missingProperty("transcoderAll", "transcoderAll", reader),
          transcoderLossy ?: throw Util.missingProperty("transcoderLossy", "transcoderLossy",
              reader),
          transcoderLossless ?: throw Util.missingProperty("transcoderLossless",
              "transcoderLossless", reader),
          transcodeQuality ?: throw Util.missingProperty("transcodeQuality", "transcodeQuality",
              reader),
          /* forceManhwa */ false,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: ImageTransform.Params?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("resizeEnabled")
    booleanAdapter.toJson(writer, value_.resizeEnabled)
    writer.name("resizeMethod")
    intAdapter.toJson(writer, value_.resizeMethod)
    writer.name("resize1Ratio")
    intAdapter.toJson(writer, value_.resize1Ratio)
    writer.name("resize2Height")
    intAdapter.toJson(writer, value_.resize2Height)
    writer.name("resize2Width")
    intAdapter.toJson(writer, value_.resize2Width)
    writer.name("resize3Ratio")
    intAdapter.toJson(writer, value_.resize3Ratio)
    writer.name("transcodeMethod")
    intAdapter.toJson(writer, value_.transcodeMethod)
    writer.name("transcoderAll")
    pictureEncoderAdapter.toJson(writer, value_.transcoderAll)
    writer.name("transcoderLossy")
    pictureEncoderAdapter.toJson(writer, value_.transcoderLossy)
    writer.name("transcoderLossless")
    pictureEncoderAdapter.toJson(writer, value_.transcoderLossless)
    writer.name("transcodeQuality")
    intAdapter.toJson(writer, value_.transcodeQuality)
    writer.endObject()
  }
}
