(ns ogbe.fulcro.mui.icons.healing
  #?(:cljs (:require
            ["@mui/icons-material/Healing" :default Healing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-healing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Healing)))