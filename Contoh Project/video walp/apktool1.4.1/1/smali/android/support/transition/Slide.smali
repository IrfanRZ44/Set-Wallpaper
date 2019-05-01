.class public Landroid/support/transition/Slide;
.super Landroid/support/transition/Visibility;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/transition/Slide$c;,
        Landroid/support/transition/Slide$b;,
        Landroid/support/transition/Slide$a;
    }
.end annotation


# static fields
.field private static final g:Landroid/animation/TimeInterpolator;

.field private static final h:Landroid/animation/TimeInterpolator;

.field private static final k:Landroid/support/transition/Slide$a;

.field private static final l:Landroid/support/transition/Slide$a;

.field private static final m:Landroid/support/transition/Slide$a;

.field private static final n:Landroid/support/transition/Slide$a;

.field private static final o:Landroid/support/transition/Slide$a;

.field private static final p:Landroid/support/transition/Slide$a;


# instance fields
.field private i:Landroid/support/transition/Slide$a;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->g:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->h:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/support/transition/Slide$1;

    invoke-direct {v0}, Landroid/support/transition/Slide$1;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->k:Landroid/support/transition/Slide$a;

    new-instance v0, Landroid/support/transition/Slide$2;

    invoke-direct {v0}, Landroid/support/transition/Slide$2;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->l:Landroid/support/transition/Slide$a;

    new-instance v0, Landroid/support/transition/Slide$3;

    invoke-direct {v0}, Landroid/support/transition/Slide$3;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->m:Landroid/support/transition/Slide$a;

    new-instance v0, Landroid/support/transition/Slide$4;

    invoke-direct {v0}, Landroid/support/transition/Slide$4;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->n:Landroid/support/transition/Slide$a;

    new-instance v0, Landroid/support/transition/Slide$5;

    invoke-direct {v0}, Landroid/support/transition/Slide$5;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->o:Landroid/support/transition/Slide$a;

    new-instance v0, Landroid/support/transition/Slide$6;

    invoke-direct {v0}, Landroid/support/transition/Slide$6;-><init>()V

    sput-object v0, Landroid/support/transition/Slide;->p:Landroid/support/transition/Slide$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v1, 0x50

    invoke-direct {p0}, Landroid/support/transition/Visibility;-><init>()V

    sget-object v0, Landroid/support/transition/Slide;->p:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    iput v1, p0, Landroid/support/transition/Slide;->j:I

    invoke-virtual {p0, v1}, Landroid/support/transition/Slide;->a(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/16 v3, 0x50

    invoke-direct {p0, p1, p2}, Landroid/support/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Landroid/support/transition/Slide;->p:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    iput v3, p0, Landroid/support/transition/Slide;->j:I

    sget-object v0, Landroid/support/transition/ac;->h:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, "slideEdge"

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2, v3}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v1

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v1}, Landroid/support/transition/Slide;->a(I)V

    return-void
.end method

.method private d(Landroid/support/transition/ah;)V
    .locals 3

    iget-object v0, p1, Landroid/support/transition/ah;->b:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:slide:screenPosition"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/transition/ah;Landroid/support/transition/ah;)Landroid/animation/Animator;
    .locals 9

    if-nez p4, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p4, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:slide:screenPosition"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    check-cast v0, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    iget-object v1, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    invoke-interface {v1, p1, p2}, Landroid/support/transition/Slide$a;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v4

    iget-object v1, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    invoke-interface {v1, p1, p2}, Landroid/support/transition/Slide$a;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v5

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v1, 0x1

    aget v3, v0, v1

    sget-object v8, Landroid/support/transition/Slide;->g:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p4

    invoke-static/range {v0 .. v8}, Landroid/support/transition/aj;->a(Landroid/view/View;Landroid/support/transition/ah;IIFFFFLandroid/animation/TimeInterpolator;)Landroid/animation/Animator;

    move-result-object v0

    goto :goto_0
.end method

.method public a(I)V
    .locals 2

    sparse-switch p1, :sswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid slide direction"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    sget-object v0, Landroid/support/transition/Slide;->k:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    :goto_0
    iput p1, p0, Landroid/support/transition/Slide;->j:I

    new-instance v0, Landroid/support/transition/ab;

    invoke-direct {v0}, Landroid/support/transition/ab;-><init>()V

    invoke-virtual {v0, p1}, Landroid/support/transition/ab;->a(I)V

    invoke-virtual {p0, v0}, Landroid/support/transition/Slide;->a(Landroid/support/transition/af;)V

    return-void

    :sswitch_1
    sget-object v0, Landroid/support/transition/Slide;->m:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    goto :goto_0

    :sswitch_2
    sget-object v0, Landroid/support/transition/Slide;->n:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    goto :goto_0

    :sswitch_3
    sget-object v0, Landroid/support/transition/Slide;->p:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    goto :goto_0

    :sswitch_4
    sget-object v0, Landroid/support/transition/Slide;->l:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    goto :goto_0

    :sswitch_5
    sget-object v0, Landroid/support/transition/Slide;->o:Landroid/support/transition/Slide$a;

    iput-object v0, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x5 -> :sswitch_2
        0x30 -> :sswitch_1
        0x50 -> :sswitch_3
        0x800003 -> :sswitch_4
        0x800005 -> :sswitch_5
    .end sparse-switch
.end method

.method public a(Landroid/support/transition/ah;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/transition/Visibility;->a(Landroid/support/transition/ah;)V

    invoke-direct {p0, p1}, Landroid/support/transition/Slide;->d(Landroid/support/transition/ah;)V

    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/transition/ah;Landroid/support/transition/ah;)Landroid/animation/Animator;
    .locals 9

    if-nez p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p3, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:slide:screenPosition"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    check-cast v0, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    iget-object v1, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    invoke-interface {v1, p1, p2}, Landroid/support/transition/Slide$a;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v6

    iget-object v1, p0, Landroid/support/transition/Slide;->i:Landroid/support/transition/Slide$a;

    invoke-interface {v1, p1, p2}, Landroid/support/transition/Slide$a;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v7

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v1, 0x1

    aget v3, v0, v1

    sget-object v8, Landroid/support/transition/Slide;->h:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p3

    invoke-static/range {v0 .. v8}, Landroid/support/transition/aj;->a(Landroid/view/View;Landroid/support/transition/ah;IIFFFFLandroid/animation/TimeInterpolator;)Landroid/animation/Animator;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Landroid/support/transition/ah;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/transition/Visibility;->b(Landroid/support/transition/ah;)V

    invoke-direct {p0, p1}, Landroid/support/transition/Slide;->d(Landroid/support/transition/ah;)V

    return-void
.end method
