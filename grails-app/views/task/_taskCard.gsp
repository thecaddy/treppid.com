<div class="task">
    <h4>${ task.summary }</h4>
    <div><pomo:textToParagraph>${ task.details }</pomo:textToParagraph></div>
    <div class="due">Due: <pomo:deadline date="${ task.deadline }"/></div>
    <div class="created">Created: <pomo:deadline date="${ task.dateCreated }"/></div>
</div>
