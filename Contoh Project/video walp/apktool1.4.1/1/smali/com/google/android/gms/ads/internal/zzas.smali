.class public final Lcom/google/android/gms/ads/internal/zzas;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# direct methods
.method static a(Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/internal/ads/bda;Lcom/google/android/gms/ads/internal/zzac;)Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/bcw;",
            "Lcom/google/android/gms/internal/ads/bda;",
            "Lcom/google/android/gms/ads/internal/zzac;",
            ")",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/ads/internal/n;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/ads/internal/n;-><init>(Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/ads/internal/zzac;Lcom/google/android/gms/internal/ads/bda;)V

    return-object v0
.end method

.method private static a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aun;
    .locals 1

    instance-of v0, p0, Landroid/os/IBinder;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/os/IBinder;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/auo;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/aun;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    if-nez p0, :cond_0

    const-string v0, "Bitmap is null. Returning empty string"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "data:image/png;base64,"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string v0, "Image is null. Returning empty string"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/aun;->b()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Unable to get image uri. Trying data uri next"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/zzas;->b(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v0, v2

    :goto_0
    return-object v0

    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "image"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_3

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzas;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_3
    const-string v0, "Invalid type. An image type extra should return a bitmap"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_5

    const-string v0, "Invalid asset type. Bitmap should be returned only for image type"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_6
    move-object v0, v2

    goto :goto_0
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/atf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;Z)V
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "headline"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "body"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "call_to_action"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "price"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "star_rating"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->f()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "store"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "icon"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->b()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/zzas;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aun;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred when loading assets"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_0
    :try_start_1
    const-string v2, "images"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "extras"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/atf;->n()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/ads/internal/zzas;->a(Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "assets"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "template_id"

    const-string v2, "2"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "google.afma.nativeExpressAds.loadAssets"

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/ath;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;Z)V
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "headline"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "body"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "call_to_action"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "advertiser"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "logo"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->f()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->b()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/zzas;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aun;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred when loading assets"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_0
    :try_start_1
    const-string v2, "images"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "extras"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ath;->n()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/ads/internal/zzas;->a(Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "assets"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "template_id"

    const-string v2, "1"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "google.afma.nativeExpressAds.loadAssets"

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/qe;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/ads/internal/zzas;->b(Lcom/google/android/gms/internal/ads/qe;)V

    return-void
.end method

.method private static b(Lcom/google/android/gms/internal/ads/aun;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/aun;->a()Lcom/google/android/gms/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Drawable is null. Returning empty string"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v1, :cond_1

    const-string v0, "Drawable is not an instance of BitmapDrawable. Returning empty string"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const-string v0, ""

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Unable to get drawable. Returning empty string"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const-string v0, ""

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzas;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Lcom/google/android/gms/internal/ads/qe;)V
    .locals 2

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/qe;->getOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/qe;Lcom/google/android/gms/internal/ads/bcb;Ljava/util/concurrent/CountDownLatch;)Z
    .locals 19

    const/16 v18, 0x0

    :try_start_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "AdWebView is null"

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_0

    invoke-virtual/range {p2 .. p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return v2

    :cond_1
    const/4 v3, 0x4

    :try_start_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/bbt;->r:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const-string v2, "No template ids present in mediation response"

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    const-string v3, "/nativeExpressAssetsLoaded"

    new-instance v4, Lcom/google/android/gms/ads/internal/l;

    move-object/from16 v0, p2

    invoke-direct {v4, v0}, Lcom/google/android/gms/ads/internal/l;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    move-object/from16 v0, p0

    invoke-interface {v0, v3, v4}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v3, "/nativeExpressAssetsLoadingFailed"

    new-instance v4, Lcom/google/android/gms/ads/internal/m;

    move-object/from16 v0, p2

    invoke-direct {v4, v0}, Lcom/google/android/gms/ads/internal/m;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    move-object/from16 v0, p0

    invoke-interface {v0, v3, v4}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bcb;->c:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/bcn;->h()Lcom/google/android/gms/internal/ads/bcw;

    move-result-object v16

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bcb;->c:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/bcn;->i()Lcom/google/android/gms/internal/ads/bda;

    move-result-object v13

    const-string v3, "2"

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v16, :cond_5

    new-instance v2, Lcom/google/android/gms/internal/ads/atf;

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->c()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v6

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->e()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->f()D

    move-result-wide v8

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->g()Ljava/lang/String;

    move-result-object v10

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->h()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->l()Landroid/os/Bundle;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v15

    if-eqz v15, :cond_4

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v15

    invoke-static {v15}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    :goto_1
    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/bcw;->q()Lcom/google/android/gms/a/a;

    move-result-object v16

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v17}, Lcom/google/android/gms/internal/ads/atf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;)V

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/bbt;->q:Ljava/lang/String;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/ads/internal/j;

    move-object/from16 v0, p0

    invoke-direct {v5, v2, v3, v0}, Lcom/google/android/gms/ads/internal/j;-><init>(Lcom/google/android/gms/internal/ads/atf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;)V

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/rn;)V

    :goto_2
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/bbt;->o:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/bbt;->p:Ljava/lang/String;

    if-eqz v3, :cond_8

    const-string v5, "text/html"

    const-string v6, "UTF-8"

    const/4 v7, 0x0

    move-object/from16 v2, p0

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/qe;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_4
    const/4 v15, 0x0

    goto :goto_1

    :cond_5
    const-string v3, "1"

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v13, :cond_7

    new-instance v2, Lcom/google/android/gms/internal/ads/ath;

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->c()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v6

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->e()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->f()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->j()Landroid/os/Bundle;

    move-result-object v10

    const/4 v11, 0x0

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v12

    invoke-static {v12}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    :goto_4
    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/bda;->o()Lcom/google/android/gms/a/a;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/ath;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;)V

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/bbt;->q:Ljava/lang/String;

    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/ads/internal/k;

    move-object/from16 v0, p0

    invoke-direct {v5, v2, v3, v0}, Lcom/google/android/gms/ads/internal/k;-><init>(Lcom/google/android/gms/internal/ads/ath;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;)V

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/rn;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_0
    move-exception v2

    const-string v3, "Unable to invoke load assets"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move/from16 v2, v18

    goto/16 :goto_0

    :cond_6
    const/4 v12, 0x0

    goto :goto_4

    :cond_7
    :try_start_2
    const-string v2, "No matching template id and mapper"

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_8
    const-string v2, "text/html"

    const-string v3, "UTF-8"

    move-object/from16 v0, p0

    invoke-interface {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/qe;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception v2

    invoke-virtual/range {p2 .. p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v2
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/ij;)Landroid/view/View;
    .locals 3

    const/4 v1, 0x0

    if-nez p0, :cond_0

    const-string v0, "AdState is null"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/zzas;->zzf(Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->b:Lcom/google/android/gms/internal/ads/qe;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->b:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bcn;->a()Lcom/google/android/gms/a/a;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_3

    const-string v0, "View in mediation adapter is null."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Could not get View from mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public static zzf(Lcom/google/android/gms/internal/ads/ij;)Z
    .locals 1

    if-eqz p0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ij;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bbt;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
