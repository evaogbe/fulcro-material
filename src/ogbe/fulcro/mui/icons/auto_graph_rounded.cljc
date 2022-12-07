(ns ogbe.fulcro.mui.icons.auto-graph-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AutoGraphRounded" :default AutoGraphRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-graph-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoGraphRounded)))