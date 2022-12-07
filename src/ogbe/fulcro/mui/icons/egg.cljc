(ns ogbe.fulcro.mui.icons.egg
  #?(:cljs (:require
            ["@mui/icons-material/Egg" :default Egg]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Egg)))