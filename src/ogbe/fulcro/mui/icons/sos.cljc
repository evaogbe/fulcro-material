(ns ogbe.fulcro.mui.icons.sos
  #?(:cljs (:require
            ["@mui/icons-material/Sos" :default Sos]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sos
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sos)))