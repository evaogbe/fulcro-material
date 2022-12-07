(ns ogbe.fulcro.mui.icons.pattern
  #?(:cljs (:require
            ["@mui/icons-material/Pattern" :default Pattern]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pattern
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pattern)))