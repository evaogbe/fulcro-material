(ns ogbe.fulcro.mui.icons.attach-money
  #?(:cljs (:require
            ["@mui/icons-material/AttachMoney" :default AttachMoney]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attach-money
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachMoney)))