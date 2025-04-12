<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container mt-4"> <%-- Added top margin for spacing below the navbar --%>
    <div class="p-5 mb-4 bg-light rounded-3"> <%-- Jumbotron-like effect --%>
        <div class="container-fluid py-5">
            <p class="col-md-8 fs-4">Ready to manage your tasks? Click the button below to see your To-Do list.</p>
            <a href="list-todos" class="btn btn-primary btn-lg" role="button">Manage Your Todos</a>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf" %>
