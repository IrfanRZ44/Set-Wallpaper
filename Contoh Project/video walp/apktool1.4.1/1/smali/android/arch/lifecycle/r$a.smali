.class Landroid/arch/lifecycle/r$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/arch/lifecycle/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/arch/lifecycle/e$a;

.field private final b:Landroid/arch/lifecycle/i;

.field private c:Z


# direct methods
.method constructor <init>(Landroid/arch/lifecycle/i;Landroid/arch/lifecycle/e$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/arch/lifecycle/r$a;->c:Z

    iput-object p1, p0, Landroid/arch/lifecycle/r$a;->b:Landroid/arch/lifecycle/i;

    iput-object p2, p0, Landroid/arch/lifecycle/r$a;->a:Landroid/arch/lifecycle/e$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroid/arch/lifecycle/r$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/arch/lifecycle/r$a;->b:Landroid/arch/lifecycle/i;

    iget-object v1, p0, Landroid/arch/lifecycle/r$a;->a:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/arch/lifecycle/r$a;->c:Z

    :cond_0
    return-void
.end method
