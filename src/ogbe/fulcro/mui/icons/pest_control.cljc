(ns ogbe.fulcro.mui.icons.pest-control
  #?(:cljs (:require
            ["@mui/icons-material/PestControl" :default PestControl]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pest-control
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PestControl)))