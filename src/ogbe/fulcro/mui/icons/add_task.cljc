(ns ogbe.fulcro.mui.icons.add-task
  #?(:cljs (:require
            ["@mui/icons-material/AddTask" :default AddTask]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-task
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddTask)))