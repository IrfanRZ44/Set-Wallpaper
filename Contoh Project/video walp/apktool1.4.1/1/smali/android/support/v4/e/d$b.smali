.class Landroid/support/v4/e/d$b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/e/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Landroid/support/v4/e/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/e/d$b;

    invoke-direct {v0}, Landroid/support/v4/e/d$b;-><init>()V

    sput-object v0, Landroid/support/v4/e/d$b;->a:Landroid/support/v4/e/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;II)I
    .locals 3

    const/4 v1, 0x2

    add-int v2, p2, p3

    move v0, v1

    :goto_0
    if-ge p2, v2, :cond_0

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v0

    invoke-static {v0}, Landroid/support/v4/e/d;->b(I)I

    move-result v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method
