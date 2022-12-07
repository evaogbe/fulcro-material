(ns ogbe.fulcro.mui.icons.flag-circle
  #?(:cljs (:require
            ["@mui/icons-material/FlagCircle" :default FlagCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlagCircle)))