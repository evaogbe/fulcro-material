(ns ogbe.fulcro.mui.icons.unsubscribe
  #?(:cljs (:require
            ["@mui/icons-material/Unsubscribe" :default Unsubscribe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-unsubscribe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Unsubscribe)))