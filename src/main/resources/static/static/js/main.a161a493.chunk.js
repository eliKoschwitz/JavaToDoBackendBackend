(this.webpackJsonpfrontend=this.webpackJsonpfrontend||[]).push([[0],{68:function(t,e,n){"use strict";n.r(e);var o=n(1),c=n.n(o),r=n(32),i=n.n(r),a=n(11),d=n(10),s=n(13),u=n.n(s),j=function(){return u.a.get("/api/todo").then((function(t){return t.data}))},l=function(t){return u.a.get("/api/todo/".concat(t)).then((function(t){return t.data}))},b=function(t){return u.a.put("/api/todo/".concat(t.id),t)},p={OPEN:"IN_PROGRESS",IN_PROGRESS:"DONE"},h={todo:"OPEN",doing:"IN_PROGRESS",done:"DONE"},O={OPEN:"Todo",IN_PROGRESS:"Doing",DONE:"Done"},f=n(5),x=n(3),v=n(2),g=n(0);function m(){return Object(g.jsxs)(N,{children:[Object(g.jsx)(f.c,{exact:!0,to:"/",children:"Home"}),Object(g.jsx)(f.c,{to:"/board/todo",children:"Todo"}),Object(g.jsx)(f.c,{to:"/board/doing",children:"Doing"}),Object(g.jsx)(f.c,{to:"/board/done",children:"Done"})]})}var N=v.b.nav.withConfig({displayName:"Navbar__Nav",componentId:"sc-6ppbkg-0"})(["display:flex;justify-content:space-evenly;a{padding:4px;text-decoration:none;color:hotpink;}a.active{background:hotpink;color:white;}"]);function y(){return Object(g.jsxs)("header",{children:[Object(g.jsx)(S,{children:"Super Kanban"}),Object(g.jsx)(m,{})]})}var S=v.b.h1.withConfig({displayName:"Header__Heading",componentId:"sc-1313ecv-0"})(["margin:0;padding:12px;"]);function D(t){var e=t.todo,n=t.onAdvance,o=t.onDelete;return Object(g.jsxs)(_,{children:[Object(g.jsx)(f.b,{to:"/details/".concat(e.id),children:"Details"}),Object(g.jsx)(f.b,{to:"/edit/".concat(e.id),children:"Edit"}),n&&Object(g.jsx)(w,{adv:!0,onClick:function(){return n(e)},children:"Advance"}),o&&Object(g.jsx)(w,{del:!0,onClick:function(){return o(e.id)},children:"Delete"})]})}var _=v.b.section.withConfig({displayName:"TodoActions__Wrapper",componentId:"sc-q5x805-0"})(["display:flex;justify-content:space-between;"]),w=v.b.button.withConfig({displayName:"TodoActions__ButtonComp",componentId:"sc-q5x805-1"})([""," ",""],(function(t){return t.del?"background-color: lightcoral;":""}),(function(t){return t.adv?"background-color: lightblue;":""}));function C(t){var e=t.todo,n=t.onAdvance,o=t.onDelete;return Object(g.jsxs)(E,{children:[Object(g.jsx)("h3",{children:e.description}),Object(g.jsx)(D,{todo:e,onAdvance:n,onDelete:o})]})}var E=v.b.section.withConfig({displayName:"TodoItem__TodoItemStyleComp",componentId:"sc-6lr0op-0"})(["border:1px solid #333;border-radius:8px;padding:12px;box-shadow:1px 2px 8px #666;"]);function I(t){var e=t.className,n=t.title,o=t.todos,c=t.onAdvance,r=t.onDelete;return Object(g.jsxs)("section",{className:e,children:[Object(g.jsx)("h2",{children:n}),Object(g.jsx)(A,{children:o.map((function(t){return Object(g.jsx)("li",{children:Object(g.jsx)(C,{todo:t,onAdvance:c,onDelete:r})},t.id)}))})]})}var A=v.b.ul.withConfig({displayName:"Board__List",componentId:"sc-1yu0kxh-0"})(["list-style:none;padding:0;margin:0;display:grid;grid-gap:12px;"]);function T(t){var e=t.todos,n=t.onAdvance,o=t.onDelete,c=e.filter((function(t){return"OPEN"===t.status})),r=e.filter((function(t){return"IN_PROGRESS"===t.status})),i=e.filter((function(t){return"DONE"===t.status}));return Object(g.jsxs)(P,{children:[Object(g.jsx)(I,{title:"Todo",todos:c,onAdvance:n}),Object(g.jsx)(I,{title:"Doing",todos:r,onAdvance:n}),Object(g.jsx)(I,{title:"Done",todos:i,onDelete:o})]})}var P=v.b.main.withConfig({displayName:"BoardsOverview__Wrapper",componentId:"sc-2ppav9-0"})(["overflow-y:scroll;display:grid;grid-template-columns:repeat(auto-fit,minmax(300px,1fr));grid-gap:12px;padding:0 12px;"]);function k(t){var e=t.onAdd,n=Object(o.useState)(""),c=Object(d.a)(n,2),r=c[0],i=c[1];return Object(g.jsxs)(R,{onSubmit:function(t){t.preventDefault(),r&&e(r).then((function(){return i("")}))},children:[Object(g.jsx)("input",{type:"text",value:r,onChange:function(t){return i(t.target.value)}}),Object(g.jsx)("button",{children:"Add"})]})}var R=v.b.form.withConfig({displayName:"NewTodo__Wrapper",componentId:"sc-1sqp046-0"})(["display:grid;grid-template-columns:1fr min-content;padding:12px;"]),B=v.b.div.withConfig({displayName:"PageLayout",componentId:"sc-1b3dpzk-0"})(["position:fixed;top:0;left:0;width:100%;height:100%;display:grid;grid-template-rows:min-content 1fr min-content;"]);function F(t){var e=t.todos,n=t.advanceTodo,o=t.removeTodo,c=t.createNewTodo;return Object(g.jsxs)(B,{children:[Object(g.jsx)(y,{}),Object(g.jsx)(T,{todos:e,onAdvance:n,onDelete:o}),Object(g.jsx)(k,{onAdd:c})]})}function G(t){var e=t.description,n=t.status;return Object(g.jsxs)(W,{children:[Object(g.jsx)("h2",{children:e}),Object(g.jsxs)("p",{children:["Status: ",n]}),Object(g.jsx)(f.b,{to:"/",children:"Back"})]})}var W=v.b.section.withConfig({displayName:"TodoDetails__Wrapper",componentId:"sc-1etwhir-0"})(["padding:12px;"]);function q(){var t=Object(x.h)().id,e=Object(o.useState)(),n=Object(d.a)(e,2),c=n[0],r=n[1];return Object(o.useEffect)((function(){l(t).then((function(t){return r(t)})).catch((function(t){return console.error(t)}))}),[t]),c?Object(g.jsxs)(B,{children:[Object(g.jsx)(y,{}),Object(g.jsx)(G,Object(a.a)({},c))]}):Object(g.jsx)("p",{children:"loading"})}function L(t){var e=t.todos,n=t.onAdvance,o=t.onDelete,c=Object(x.h)().statusSlug,r=h[c],i=e.filter((function(t){return t.status===r})),a=function(t){return O[t]}(r);return Object(g.jsxs)(B,{children:[Object(g.jsx)(y,{}),Object(g.jsx)(z,{title:a,todos:i,onAdvance:"DONE"!==r?n:void 0,onDelete:"DONE"===r?o:void 0})]})}var z=Object(v.b)(I).withConfig({displayName:"BoardPage__BoardStyled",componentId:"sc-1xcdg9l-0"})(["padding:0 12px;"]),H=n(16);function J(t){var e=function(t,e){var n=Object(o.useState)({description:t.description,status:t.status}),c=Object(d.a)(n,2),r=c[0],i=c[1],s=Object(x.g)();return{formData:r,handleSubmit:function(n){n.preventDefault();var o=Object(a.a)(Object(a.a)({},t),r);e(o).then((function(){return s.push("/")}))},handleChange:function(t){var e=t.target,n=e.name,o=e.value;i(Object(a.a)(Object(a.a)({},r),{},Object(H.a)({},n,o)))},resetForm:function(){i({description:t.description,status:t.status})}}}(t.todo,t.onSave),n=e.formData,c=e.handleSubmit,r=e.handleChange,i=e.resetForm;return Object(g.jsxs)(K,{onSubmit:c,children:[Object(g.jsxs)("label",{children:["Description",Object(g.jsx)("input",{type:"text",name:"description",value:n.description,onChange:r})]}),Object(g.jsxs)("label",{children:["Status",Object(g.jsxs)("select",{name:"status",value:n.status,onChange:r,children:[Object(g.jsx)("option",{value:"OPEN",children:"open"}),Object(g.jsx)("option",{value:"IN_PROGRESS",children:"doing"}),Object(g.jsx)("option",{value:"DONE",children:"done"})]})]}),Object(g.jsx)("button",{type:"button",onClick:i,children:"Reset"}),Object(g.jsx)("button",{children:"Save"})]})}var K=v.b.form.withConfig({displayName:"TodoForm__Wrapper",componentId:"sc-vzq0wb-0"})(["display:grid;grid-gap:12px;place-content:center;input,select{display:block;width:100%;}"]);function M(t){var e=t.onSave,n=Object(x.h)().id,c=Object(o.useState)(),r=Object(d.a)(c,2),i=r[0],a=r[1];return Object(o.useEffect)((function(){l(n).then(a).catch(console.error)}),[n]),Object(g.jsxs)(B,{children:[Object(g.jsx)(y,{}),i?Object(g.jsx)(J,{todo:i,onSave:e}):Object(g.jsx)("p",{children:"loading"})]})}function Q(){var t=Object(o.useState)([]),e=Object(d.a)(t,2),n=e[0],c=e[1];Object(o.useEffect)((function(){j().then((function(t){return c(t)})).catch((function(t){return console.error(t)}))}),[]);var r=function(t){var e,n=Object(a.a)(Object(a.a)({},t),{},{status:(e=t.status,p[e])});b(n).then((function(){return j()})).then((function(t){return c(t)})).catch((function(t){return console.error(t)}))},i=function(t){return function(t){return u.a.delete("/api/todo/".concat(t))}(t).then((function(){return j()})).then((function(t){return c(t)})).catch((function(t){return console.error(t)}))};return Object(g.jsx)(f.a,{children:Object(g.jsxs)(x.d,{children:[Object(g.jsx)(x.b,{exact:!0,path:"/",children:Object(g.jsx)(F,{todos:n,advanceTodo:r,removeTodo:i,createNewTodo:function(t){return function(t){return u.a.post("/api/todo",{description:t,status:"OPEN"})}(t).then((function(){return j()})).then((function(t){return c(t)})).catch((function(t){return console.error(t)}))}})}),Object(g.jsx)(x.b,{path:"/board/:statusSlug",children:Object(g.jsx)(L,{todos:n,onAdvance:r,onDelete:i})}),Object(g.jsx)(x.b,{path:"/edit/:id",children:Object(g.jsx)(M,{onSave:function(t){return b(t).then((function(){return j()})).then((function(t){return c(t)})).catch((function(t){return console.error(t)}))}})}),Object(g.jsx)(x.b,{path:"/details/:id",children:Object(g.jsx)(q,{})}),Object(g.jsx)(x.b,{path:"/",children:Object(g.jsx)(x.a,{to:"/"})})]})})}var U,V=function(t){t&&t instanceof Function&&n.e(3).then(n.bind(null,69)).then((function(e){var n=e.getCLS,o=e.getFID,c=e.getFCP,r=e.getLCP,i=e.getTTFB;n(t),o(t),c(t),r(t),i(t)}))},X=n(36),Y=Object(v.a)(U||(U=Object(X.a)(["\n* {\n  box-sizing: border-box;\n}\n\nhtml, body {\n  margin: 0;\n  font-family: sans-serif;\n}\n"])));i.a.render(Object(g.jsxs)(c.a.StrictMode,{children:[Object(g.jsx)(Y,{}),Object(g.jsx)(Q,{})]}),document.getElementById("root")),V()}},[[68,1,2]]]);
//# sourceMappingURL=main.a161a493.chunk.js.map