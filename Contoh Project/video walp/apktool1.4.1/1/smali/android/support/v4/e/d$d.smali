.class abstract Landroid/support/v4/e/d$d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/e/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "d"
.end annotation


# instance fields
.field private final a:Landroid/support/v4/e/d$c;


# direct methods
.method constructor <init>(Landroid/support/v4/e/d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/e/d$d;->a:Landroid/support/v4/e/d$c;

    return-void
.end method

.method private b(Ljava/lang/CharSequence;II)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/e/d$d;->a:Landroid/support/v4/e/d$c;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/e/d$c;->a(Ljava/lang/CharSequence;II)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Landroid/support/v4/e/d$d;->a()Z

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method protected abstract a()Z
.end method

.method public a(Ljava/lang/CharSequence;II)Z
    .locals 1

    if-eqz p1, :cond_0

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p3

    if-ge v0, p2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/e/d$d;->a:Landroid/support/v4/e/d$c;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/support/v4/e/d$d;->a()Z

    move-result v0

    :goto_0
    return v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/e/d$d;->b(Ljava/lang/CharSequence;II)Z

    move-result v0

    goto :goto_0
.end method
