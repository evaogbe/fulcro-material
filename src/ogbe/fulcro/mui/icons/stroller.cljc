(ns ogbe.fulcro.mui.icons.stroller
  #?(:cljs (:require
            ["@mui/icons-material/Stroller" :default Stroller]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stroller
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stroller)))