(ns ogbe.fulcro.mui.icons.auto-graph
  #?(:cljs (:require
            ["@mui/icons-material/AutoGraph" :default AutoGraph]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-graph
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoGraph)))