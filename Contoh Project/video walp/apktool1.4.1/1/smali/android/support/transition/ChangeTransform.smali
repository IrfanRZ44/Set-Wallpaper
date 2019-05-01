.class public Landroid/support/transition/ChangeTransform;
.super Landroid/support/transition/Transition;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/transition/ChangeTransform$b;,
        Landroid/support/transition/ChangeTransform$a;,
        Landroid/support/transition/ChangeTransform$c;
    }
.end annotation


# static fields
.field private static final g:[Ljava/lang/String;

.field private static final h:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property",
            "<",
            "Landroid/support/transition/ChangeTransform$b;",
            "[F>;"
        }
    .end annotation
.end field

.field private static final i:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property",
            "<",
            "Landroid/support/transition/ChangeTransform$b;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final j:Z


# instance fields
.field private k:Z

.field private l:Z

.field private m:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android:changeTransform:matrix"

    aput-object v3, v2, v1

    const-string v3, "android:changeTransform:transforms"

    aput-object v3, v2, v0

    const/4 v3, 0x2

    const-string v4, "android:changeTransform:parentMatrix"

    aput-object v4, v2, v3

    sput-object v2, Landroid/support/transition/ChangeTransform;->g:[Ljava/lang/String;

    new-instance v2, Landroid/support/transition/ChangeTransform$1;

    const-class v3, [F

    const-string v4, "nonTranslations"

    invoke-direct {v2, v3, v4}, Landroid/support/transition/ChangeTransform$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v2, Landroid/support/transition/ChangeTransform;->h:Landroid/util/Property;

    new-instance v2, Landroid/support/transition/ChangeTransform$2;

    const-class v3, Landroid/graphics/PointF;

    const-string v4, "translations"

    invoke-direct {v2, v3, v4}, Landroid/support/transition/ChangeTransform$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v2, Landroid/support/transition/ChangeTransform;->i:Landroid/util/Property;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_0

    :goto_0
    sput-boolean v0, Landroid/support/transition/ChangeTransform;->j:Z

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0}, Landroid/support/transition/Transition;-><init>()V

    iput-boolean v0, p0, Landroid/support/transition/ChangeTransform;->k:Z

    iput-boolean v0, p0, Landroid/support/transition/ChangeTransform;->l:Z

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/transition/ChangeTransform;->m:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x1

    invoke-direct {p0, p1, p2}, Landroid/support/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-boolean v3, p0, Landroid/support/transition/ChangeTransform;->k:Z

    iput-boolean v3, p0, Landroid/support/transition/ChangeTransform;->l:Z

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/transition/ChangeTransform;->m:Landroid/graphics/Matrix;

    sget-object v0, Landroid/support/transition/ac;->g:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    move-object v0, p2

    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    const-string v2, "reparentWithOverlay"

    invoke-static {v1, v0, v2, v3, v3}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/transition/ChangeTransform;->k:Z

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v0, "reparent"

    const/4 v2, 0x0

    invoke-static {v1, p2, v0, v2, v3}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/transition/ChangeTransform;->l:Z

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/support/transition/ah;Landroid/support/transition/ah;Z)Landroid/animation/ObjectAnimator;
    .locals 11

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:matrix"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    iget-object v1, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:matrix"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    sget-object v0, Landroid/support/transition/o;->a:Landroid/graphics/Matrix;

    :cond_0
    if-nez v1, :cond_2

    sget-object v3, Landroid/support/transition/o;->a:Landroid/graphics/Matrix;

    :goto_0
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :cond_1
    iget-object v1, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:transforms"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/support/transition/ChangeTransform$c;

    iget-object v4, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-static {v4}, Landroid/support/transition/ChangeTransform;->g(Landroid/view/View;)V

    const/16 v1, 0x9

    new-array v1, v1, [F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/16 v0, 0x9

    new-array v0, v0, [F

    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->getValues([F)V

    new-instance v6, Landroid/support/transition/ChangeTransform$b;

    invoke-direct {v6, v4, v1}, Landroid/support/transition/ChangeTransform$b;-><init>(Landroid/view/View;[F)V

    sget-object v2, Landroid/support/transition/ChangeTransform;->h:Landroid/util/Property;

    new-instance v7, Landroid/support/transition/f;

    const/16 v8, 0x9

    new-array v8, v8, [F

    invoke-direct {v7, v8}, Landroid/support/transition/f;-><init>([F)V

    const/4 v8, 0x2

    new-array v8, v8, [[F

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v9, 0x1

    aput-object v0, v8, v9

    invoke-static {v2, v7, v8}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/support/transition/ChangeTransform;->l()Landroid/support/transition/PathMotion;

    move-result-object v7

    const/4 v8, 0x2

    aget v8, v1, v8

    const/4 v9, 0x5

    aget v1, v1, v9

    const/4 v9, 0x2

    aget v9, v0, v9

    const/4 v10, 0x5

    aget v0, v0, v10

    invoke-virtual {v7, v8, v1, v9, v0}, Landroid/support/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    move-result-object v0

    sget-object v1, Landroid/support/transition/ChangeTransform;->i:Landroid/util/Property;

    invoke-static {v1, v0}, Landroid/support/transition/u;->a(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/animation/PropertyValuesHolder;

    const/4 v7, 0x0

    aput-object v2, v1, v7

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v6, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v7

    new-instance v0, Landroid/support/transition/ChangeTransform$3;

    move-object v1, p0

    move v2, p3

    invoke-direct/range {v0 .. v6}, Landroid/support/transition/ChangeTransform$3;-><init>(Landroid/support/transition/ChangeTransform;ZLandroid/graphics/Matrix;Landroid/view/View;Landroid/support/transition/ChangeTransform$c;Landroid/support/transition/ChangeTransform$b;)V

    invoke-virtual {v7, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-static {v7, v0}, Landroid/support/transition/a;->a(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V

    move-object v0, v7

    goto :goto_1

    :cond_2
    move-object v3, v1

    goto :goto_0
.end method

.method static synthetic a(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroid/support/transition/ChangeTransform;->g(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Landroid/view/View;FFFFFFFF)V
    .locals 0

    invoke-static/range {p0 .. p8}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/View;FFFFFFFF)V

    return-void
.end method

.method static synthetic a(Landroid/support/transition/ChangeTransform;)Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/transition/ChangeTransform;->k:Z

    return v0
.end method

.method private a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p2}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    if-ne p1, p2, :cond_2

    :cond_1
    :goto_0
    return v0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1, v0}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/View;Z)Landroid/support/transition/ah;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, v2, Landroid/support/transition/ah;->b:Landroid/view/View;

    if-eq p2, v2, :cond_1

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method private b(Landroid/support/transition/ah;Landroid/support/transition/ah;)V
    .locals 4

    iget-object v0, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:parentMatrix"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    iget-object v1, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    sget v2, Landroid/support/transition/y$a;->parent_matrix:I

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v2, p0, Landroid/support/transition/ChangeTransform;->m:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:matrix"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iget-object v1, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:matrix"

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    :goto_0
    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:parentMatrix"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-void

    :cond_0
    move-object v1, v0

    goto :goto_0
.end method

.method private static b(Landroid/view/View;FFFFFFFF)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {p0, p3}, Landroid/support/v4/view/s;->b(Landroid/view/View;F)V

    invoke-virtual {p0, p4}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0, p5}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {p0, p6}, Landroid/view/View;->setRotationX(F)V

    invoke-virtual {p0, p7}, Landroid/view/View;->setRotationY(F)V

    invoke-virtual {p0, p8}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method private b(Landroid/view/ViewGroup;Landroid/support/transition/ah;Landroid/support/transition/ah;)V
    .locals 4

    iget-object v1, p3, Landroid/support/transition/ah;->b:Landroid/view/View;

    iget-object v0, p3, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:parentMatrix"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-static {p1, v2}, Landroid/support/transition/au;->b(Landroid/view/View;Landroid/graphics/Matrix;)V

    invoke-static {v1, p1, v2}, Landroid/support/transition/j;->a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)Landroid/support/transition/i;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:parent"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v3, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-interface {v2, v0, v3}, Landroid/support/transition/i;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    :goto_1
    iget-object v0, p0, Landroid/support/transition/Transition;->d:Landroid/support/transition/TransitionSet;

    if-eqz v0, :cond_2

    iget-object p0, p0, Landroid/support/transition/Transition;->d:Landroid/support/transition/TransitionSet;

    goto :goto_1

    :cond_2
    new-instance v0, Landroid/support/transition/ChangeTransform$a;

    invoke-direct {v0, v1, v2}, Landroid/support/transition/ChangeTransform$a;-><init>(Landroid/view/View;Landroid/support/transition/i;)V

    invoke-virtual {p0, v0}, Landroid/support/transition/Transition;->a(Landroid/support/transition/Transition$c;)Landroid/support/transition/Transition;

    sget-boolean v0, Landroid/support/transition/ChangeTransform;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    iget-object v2, p3, Landroid/support/transition/ah;->b:Landroid/view/View;

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/support/transition/au;->a(Landroid/view/View;F)V

    :cond_3
    const/high16 v0, 0x3f80

    invoke-static {v1, v0}, Landroid/support/transition/au;->a(Landroid/view/View;F)V

    goto :goto_0
.end method

.method private d(Landroid/support/transition/ah;)V
    .locals 4

    iget-object v1, p1, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:parent"

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/support/transition/ChangeTransform$c;

    invoke-direct {v0, v1}, Landroid/support/transition/ChangeTransform$c;-><init>(Landroid/view/View;)V

    iget-object v2, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:transforms"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:matrix"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Landroid/support/transition/ChangeTransform;->l:Z

    if-eqz v0, :cond_0

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v2}, Landroid/support/transition/au;->a(Landroid/view/View;Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getScrollX()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:parentMatrix"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:intermediateMatrix"

    sget v3, Landroid/support/transition/y$a;->transition_transform:I

    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:intermediateParentMatrix"

    sget v3, Landroid/support/transition/y$a;->parent_matrix:I

    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    goto :goto_1
.end method

.method private static g(Landroid/view/View;)V
    .locals 9

    const/high16 v4, 0x3f80

    const/4 v1, 0x0

    move-object v0, p0

    move v2, v1

    move v3, v1

    move v5, v4

    move v6, v1

    move v7, v1

    move v8, v1

    invoke-static/range {v0 .. v8}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/View;FFFFFFFF)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;Landroid/support/transition/ah;Landroid/support/transition/ah;)Landroid/animation/Animator;
    .locals 5

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iget-object v0, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:parent"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p3, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:parent"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v1, "android:changeTransform:parent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p3, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v2, "android:changeTransform:parent"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iget-boolean v2, p0, Landroid/support/transition/ChangeTransform;->l:Z

    if-eqz v2, :cond_6

    invoke-direct {p0, v0, v1}, Landroid/support/transition/ChangeTransform;->a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x1

    move v2, v1

    :goto_1
    iget-object v1, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:intermediateMatrix"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    if-eqz v1, :cond_2

    iget-object v3, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v4, "android:changeTransform:matrix"

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v3, "android:changeTransform:intermediateParentMatrix"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    if-eqz v1, :cond_3

    iget-object v3, p2, Landroid/support/transition/ah;->a:Ljava/util/Map;

    const-string v4, "android:changeTransform:parentMatrix"

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz v2, :cond_4

    invoke-direct {p0, p2, p3}, Landroid/support/transition/ChangeTransform;->b(Landroid/support/transition/ah;Landroid/support/transition/ah;)V

    :cond_4
    invoke-direct {p0, p2, p3, v2}, Landroid/support/transition/ChangeTransform;->a(Landroid/support/transition/ah;Landroid/support/transition/ah;Z)Landroid/animation/ObjectAnimator;

    move-result-object v1

    if-eqz v2, :cond_7

    if-eqz v1, :cond_7

    iget-boolean v2, p0, Landroid/support/transition/ChangeTransform;->k:Z

    if-eqz v2, :cond_7

    invoke-direct {p0, p1, p2, p3}, Landroid/support/transition/ChangeTransform;->b(Landroid/view/ViewGroup;Landroid/support/transition/ah;Landroid/support/transition/ah;)V

    :cond_5
    :goto_2
    move-object v0, v1

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    move v2, v1

    goto :goto_1

    :cond_7
    sget-boolean v2, Landroid/support/transition/ChangeTransform;->j:Z

    if-nez v2, :cond_5

    iget-object v2, p2, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    goto :goto_2
.end method

.method public a(Landroid/support/transition/ah;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/support/transition/ChangeTransform;->d(Landroid/support/transition/ah;)V

    sget-boolean v0, Landroid/support/transition/ChangeTransform;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p1, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/transition/ah;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public a()[Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/support/transition/ChangeTransform;->g:[Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/support/transition/ah;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/transition/ChangeTransform;->d(Landroid/support/transition/ah;)V

    return-void
.end method
