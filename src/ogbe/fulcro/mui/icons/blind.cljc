(ns ogbe.fulcro.mui.icons.blind
  #?(:cljs (:require
            ["@mui/icons-material/Blind" :default Blind]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blind
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Blind)))