.class Lcom/a/a/j$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/d/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/a/a/d/n;


# direct methods
.method constructor <init>(Lcom/a/a/d/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/j$a;->a:Lcom/a/a/d/n;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/a/a/j$a;->a:Lcom/a/a/d/n;

    invoke-virtual {v0}, Lcom/a/a/d/n;->d()V

    :cond_0
    return-void
.end method
