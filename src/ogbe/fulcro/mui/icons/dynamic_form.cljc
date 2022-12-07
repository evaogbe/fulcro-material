(ns ogbe.fulcro.mui.icons.dynamic-form
  #?(:cljs (:require
            ["@mui/icons-material/DynamicForm" :default DynamicForm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-form
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicForm)))