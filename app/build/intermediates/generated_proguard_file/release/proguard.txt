-if class me.devsaki.hentoid.util.image.ImageTransform$Params
-keepnames class me.devsaki.hentoid.util.image.ImageTransform$Params
-if class me.devsaki.hentoid.util.image.ImageTransform$Params
-keep class me.devsaki.hentoid.util.image.ImageTransform_ParamsJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class me.devsaki.hentoid.util.image.ImageTransform$Params
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class me.devsaki.hentoid.util.image.ImageTransform$Params
-keepclassmembers class me.devsaki.hentoid.util.image.ImageTransform$Params {
    public synthetic <init>(boolean,int,int,int,int,int,int,me.devsaki.hentoid.enums.PictureEncoder,me.devsaki.hentoid.enums.PictureEncoder,me.devsaki.hentoid.enums.PictureEncoder,int,boolean,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
