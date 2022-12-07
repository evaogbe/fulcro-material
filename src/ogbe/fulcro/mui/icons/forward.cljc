(ns ogbe.fulcro.mui.icons.forward
  #?(:cljs (:require
            ["@mui/icons-material/Forward" :default Forward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Forward)))