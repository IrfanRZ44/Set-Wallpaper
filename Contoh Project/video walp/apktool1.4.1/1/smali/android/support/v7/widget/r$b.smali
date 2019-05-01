.class Landroid/support/v7/widget/r$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/r;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/r;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/r;Landroid/support/v7/widget/r$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/r$b;-><init>(Landroid/support/v7/widget/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v7/widget/r;->access$102(Landroid/support/v7/widget/r;Landroid/support/v7/widget/r$b;)Landroid/support/v7/widget/r$b;

    iget-object v0, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/r;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/r;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v7/widget/r;->access$102(Landroid/support/v7/widget/r;Landroid/support/v7/widget/r$b;)Landroid/support/v7/widget/r$b;

    iget-object v0, p0, Landroid/support/v7/widget/r$b;->a:Landroid/support/v7/widget/r;

    invoke-virtual {v0}, Landroid/support/v7/widget/r;->drawableStateChanged()V

    return-void
.end method
