(ns ogbe.fulcro.mui.icons.rule
  #?(:cljs (:require
            ["@mui/icons-material/Rule" :default Rule]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rule
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rule)))